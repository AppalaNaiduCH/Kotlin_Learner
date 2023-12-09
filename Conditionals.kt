import kotlin.random.Random as Random

fun main() {
    val random = Random.nextInt(50) + 1
    when(random)
    {
        in 0..10 -> println("value is in the range 0 to 10 and value is " + random +".")
        in 11..20 -> println("value is in the range 11 to 20 and value is $random.")
        in 21..30 -> println ("value is in the range 21 to 30 and value is $random.")
        in 31..40 ->println ("value is in the range 31 to 40 and value is " + random + ".")
        in 41..50 -> println("value is in the the range 41 to 50 and value is" + random +".")
        else -> println("value is outside the range 0-50, and the value is $random")
    }
    println("The End")
}