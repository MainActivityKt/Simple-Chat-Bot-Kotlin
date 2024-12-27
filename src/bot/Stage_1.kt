package bot


fun printInitialInfo() {
    println("Hello! My name is ${BotInfo.NAME}.")
    println("I was created in ${BotInfo.CREATION_DATE}")
}

fun main() {
    printInitialInfo()
}