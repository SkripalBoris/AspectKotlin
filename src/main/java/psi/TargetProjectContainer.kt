package psi

import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.resolve.BindingContext

/**
 * Created by sba on 13.01.17.
 */
object TargetProjectContainer {
    var project: Project? = null
    var context: BindingContext? = null
}