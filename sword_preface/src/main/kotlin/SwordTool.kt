import java.io.File

fun main(args: Array<String>) {
    val f = File("log")
    f.readLines().forEach {
        // println(it)
        println(it.split("] ")[1])
    }
}


