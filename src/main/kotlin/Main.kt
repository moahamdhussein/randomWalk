fun main(args: Array<String>) {
    println("enter number of step")
    val numberStep = readln().toInt()
    var step = 1
    var yCoordinate: Int = 0
    var xCoordinate: Int = 0
    var direction: String = ""
    var randomNumber :Int = 0
    while (step <= numberStep) {
        println("enter random number")
        randomNumber = readln().toInt()
        direction = probabilityWalk(randomNumber)
        when (direction) {
            "F" -> {
                yCoordinate++
            }

            "L" -> {
                xCoordinate--
            }

            else -> {
                xCoordinate++
            }
        }
        println("step\trandomNumber\tDirection\txCoordinate\tyCoordinate")
        println("$step\t\t\t$randomNumber\t\t\t\t$direction\t\t\t$xCoordinate\t\t\t$yCoordinate")
        step++
    }
    println("the final result in random wake after $numberStep steps is ($xCoordinate , $yCoordinate) ")
}

fun probabilityWalk(x: Int): String {
    return when (x) {
        in 0..4 -> "F"
        in 5..7 -> "L"
        else -> "R"
    }
}