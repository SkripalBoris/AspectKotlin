package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.MaybeNegativeModel
import models.aspect.items.ParameterModel
import models.aspect.items.NullabilityType
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.types.FlexibleType
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.SimpleType
import org.jetbrains.kotlin.types.typeUtil.nullability

/**
 * Created by sba on 24.02.17.
 */
abstract class BaseTagSetter {
    abstract fun setTag(psiElement: PsiElement, aspectItem: AspectItem)

    abstract fun visitFile(file: KtFile, aspectItem: AspectItem)

    protected fun checkType(expectedType: ParameterModel, realType: ParameterModel) =
            expectedType.negative.xor(checkName(expectedType, realType) &&
                    checkNullability(expectedType, realType) &&
                    checkValueParams(expectedType.parameterList, realType.parameterList))

    protected fun checkName(expectedName: MaybeNegativeModel, realName: MaybeNegativeModel) =
            expectedName.name.isEmpty() ||
                    expectedName.negative xor realName.name.matches(expectedName.name.replace("*", ".*").toRegex())

    protected fun checkNullability(expectedType: ParameterModel, realType: ParameterModel) =
            expectedType.nullableModifier == NullabilityType.ANYTHING ||
                    expectedType.nullableModifier == realType.nullableModifier

    protected fun checkValueParams(expectedValuesParams: List<ParameterModel>, realValueParams: List<ParameterModel>): Boolean {
        if (expectedValuesParams.size != realValueParams.size)
            return false
        if (expectedValuesParams.isEmpty())
            return true

        return (0..(expectedValuesParams.size - 1)).any {
            expectedValuesParams[it].negative.xor(checkType(expectedValuesParams[it], realValueParams[it]))
        }
    }

    protected fun buildParameterModel(ktTypeReference: KtTypeReference?): ParameterModel {
        ktTypeReference?.let { reference ->
            ktTypeReference.typeElement?.let { return buildParameterModel(it) }
        }
        return ParameterModel()
    }

    protected fun buildParameterModel(kotlinType: KotlinType?): ParameterModel {
        kotlinType?.let { ktType ->
            val name = ktType.constructor.toString()
            val nullability = when (ktType.nullability().name) {
                "NULLABLE" -> NullabilityType.NULLABLE
                "FLEXIBLE" -> NullabilityType.ANYTHING
                else -> NullabilityType.NOT_NULL
            }
            return ParameterModel(name, nullableModifier = nullability)

        }
        return ParameterModel()
    }

    protected fun buildParameterModel(ktClassOrObject: KtClassOrObject?): ParameterModel {
        ktClassOrObject?.let { reference ->
            val name = reference.fqName?.toString() ?: ""
            val typeArguments = reference.typeParameters.map { buildParameterModel(it) }
            return ParameterModel(name, parameterList = typeArguments)
        }
        return ParameterModel()
    }

    protected fun buildParameterModel(ktUserType: KtTypeElement?): ParameterModel {
        ktUserType?.let { userType ->
            return when (userType) {
                is KtUserType -> {
                    val name = userType.referencedName ?: ""
                    val typeArguments = userType.typeArguments.map { buildParameterModel(it.typeReference) }
                    ParameterModel(name, parameterList = typeArguments)
                }
                else -> ParameterModel(userType.text)
            }
        }
        return ParameterModel()
    }

    protected fun buildParameterModel(ktUserType: KtTypeParameter?) =
            ParameterModel(ktUserType?.fqName?.toString() ?: "")
}