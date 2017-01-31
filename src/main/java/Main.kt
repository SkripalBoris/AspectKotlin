import org.jetbrains.kootstrap.FooBarCompiler
import org.jetbrains.kootstrap.util.opt
import org.jetbrains.kootstrap.util.targetRoots
import org.jetbrains.kotlin.psi.KtPsiFactory
import parsers.AspectParser
import psi.TargetProjectContainer
import psi.visitors.AdviceVisitor
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

    TargetProjectContainer.project = targetFiles[0].project
    TargetProjectContainer.context = FooBarCompiler.analyzeBunchOfSources(env, targetFiles, cfg)

    var aspect = AspectParser.parseFile("/home/sba/Projects/AspectKotlin/res/aspect_example.ak")

    // Размечаем psi тэгами точек включения
    aspect.pointcuts.forEach {
        PointcutTagSetter.visitFiles(it, targetFiles)
    }

    aspect.advices.forEach {
        AdviceVisitor.visitFiles(targetFiles, it)
    }
    return
}