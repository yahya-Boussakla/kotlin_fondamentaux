fun main()
{
    var trafficLightColor = "Red";
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
    val x = 4

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
    
    val y = 8

    when (y) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }


    val z: Any = "abdelouahab"

    when (z) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }

    
        trafficLightColor = "Amber"
    
        when (trafficLightColor) {
            "Red" -> println("Stop")
            "Yellow", "Amber" -> println("Slow")
            "Green" -> println("Go")
            else -> println("Invalid traffic-light color")
        }
        
}