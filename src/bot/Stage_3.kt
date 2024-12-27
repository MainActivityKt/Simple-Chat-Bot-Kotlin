package bot
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is ${BotInfo.NAME}.")
    println("I was created in ${BotInfo.CREATION_DATE}.")
    println("Please, remind me your name.")

    val userName = scanner.next()

    println("What a great name you have, $userName!")

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val (remainder3, remainder5, remainder7) = List(3) { scanner.nextInt() }
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")

    scanner.close()
}
