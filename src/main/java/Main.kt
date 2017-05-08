import org.apache.maven.shared.invoker.DefaultInvocationRequest
import org.apache.maven.shared.invoker.DefaultInvoker
import org.jetbrains.kootstrap.FooBarCompiler
import org.jetbrains.kootstrap.util.opt
import org.jetbrains.kootstrap.util.targetRoots
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtPsiFactory
import parsers.AspectParser
import psi.TargetProjectContainer
import psi.visitors.AdviceVisitor
import psi.visitors.PointcutTagSetter
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

fun main(args: Array<String>) {
    val targetProjectDir = "/home/boris/Projects/targetProjects/hello-world/"
//    val targetProjectDir = "/home/sba/Projects/targetProjects/test1/"
    val pomFile = targetProjectDir + "pom.xml"
    val srcDir = targetProjectDir + "src"
    val newPomFile = targetProjectDir + "pom2.xml"
    val newSrcDir = targetProjectDir + "src2"

    val new_args = arrayOf("-p", pomFile, "-t", srcDir)
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

    val aspect = AspectParser.parseFile("/home/boris/Projects/AspectKotlin/res/aspect_example.ak")

    // Размечаем psi тэгами точек включения
    aspect.pointcuts.forEach {
        PointcutTagSetter.visitFiles(it, targetFiles)
    }

    aspect.advices.forEach {
        AdviceVisitor.visitFiles(targetFiles, it)
    }

//    var buf = env.javaClass.getDeclaredField("sourceFiles")
//    buf.isAccessible = true
//    buf.set(env, targetFiles)
//
//    KotlinToJVMBytecodeCompiler.analyzeAndGenerate(env )
//    KotlinToJVMBytecodeCompiler.compileBunchOfSources(env)

    prepareNewFiles(srcDir, newSrcDir, targetFiles, pomFile, newPomFile)
    compileNewProject(newPomFile)
    removeNewFiles(newPomFile, newSrcDir)
    return
}

fun prepareNewFiles(oldProjectPath: String, projectPath: String, files: List<KtFile>, pomFileName: String, newPomFileName: String) {
    val projectDir = File(projectPath)
    if (projectDir.exists())
        throw Exception("Directory already exists")

    files.forEach {
        val pathToFile = projectPath + it.originalFile.virtualFile.path.substring(oldProjectPath.lastIndex + 1)
        val pathToFileDir = pathToFile.substring(0, pathToFile.lastIndex - it.originalFile.name.lastIndex)
        val fileDir = File(pathToFileDir)
        if (fileDir.exists()) {
            if (!fileDir.isDirectory)
                throw Exception("Unknown file in path")
        } else {
            fileDir.mkdirs()
        }

        val ktSrcFile = File(pathToFileDir + it.originalFile.name)
        ktSrcFile.writeText(it.text)
    }

    val docFactory = DocumentBuilderFactory.newInstance()
    val docBuilder = docFactory.newDocumentBuilder()
    val doc = docBuilder.parse(pomFileName)
    doc.getElementsByTagName("sourceDirectory").item(0).textContent = projectPath

    val transformerFactory = TransformerFactory.newInstance()
    val transformer = transformerFactory.newTransformer()
    val source = DOMSource(doc)
    val result = StreamResult(File(newPomFileName))
    transformer.transform(source, result)
}

fun compileNewProject(pathToPom: String) {
    val request = DefaultInvocationRequest()
    request.pomFile = File(pathToPom)
    request.goals = mutableListOf("package")
    val invoker = DefaultInvoker()
    invoker.mavenHome = File("/opt/maven")
    invoker.execute(request)
}

fun removeNewFiles(pomFileName: String, newSrcDir: String) {
    File(pomFileName).delete()
    File(newSrcDir).deleteRecursively()
}