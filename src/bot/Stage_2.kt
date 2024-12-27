package bot
import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is ${BotInfo.NAME}.")
    println("I was created in ${BotInfo.CREATION_DATE}.")

    println("Please, remind me your name.")
    val userName = scanner.next()
    println("What a great name you have, $userName!")

    scanner.close()
}



