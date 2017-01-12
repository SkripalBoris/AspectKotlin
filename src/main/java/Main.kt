import org.jetbrains.kootstrap.FooBarCompiler
import org.jetbrains.kootstrap.util.opt
import org.jetbrains.kootstrap.util.targetRoots
import org.jetbrains.kotlin.psi.KtPsiFactory
import parsers.AspectParser
import psi.visitors.PointcutTagSetter

fun main(args: Array<String>) {

    val new_args = arrayOf("-p", "/home/sba/Projects/kotlin-examples/maven/hello-world/pom.xml", "-t", "/home/sba/Projects/kotlin-examples/maven/hello-world/src")
    val cmd = opt.parse(new_args)

    val cfg = FooBarCompiler.setupMyCfg(cmd)
    val env = FooBarCompiler.setupMyEnv(cfg)

    val ktFiles = env.getSourceFiles().map {
        val f = KtPsiFactory(it).createFile(it.virtualFile.path, it.text)
        f.originalFile = it
        f
    }

    val targetFiles = ktFiles.filter { f ->
        cmd.targetRoots.any { root ->
            f.originalFile.virtualFile.path.startsWith(root)
        }
    }

    var aspect = AspectParser.parseFile("/home/sba/Projects/AspectKotlin/res/aspect_example.ak")

    aspect.pointcuts.forEach {
        PointcutTagSetter.visitFiles(it, targetFiles)
    }
    return
}