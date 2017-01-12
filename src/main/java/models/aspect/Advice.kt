package models.aspect

import com.intellij.psi.PsiElement
import models.boolExpr.BooleanExpression

/**
 * Created by sba on 30.11.16.
 */

class Advice(var adviceInsertPlace: String, var pointcutExpression: BooleanExpression, var adviceCode: PsiElement) {

}