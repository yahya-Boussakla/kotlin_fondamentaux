fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    var isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    
    isMonday = false
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")

}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    
    return when
            {
                age in 0..12 -> 15
                age in 13..60 && isMonday -> 25
                age in 13..60 -> 30
                else -> 20
            }
            /** 
                return when(age) {
                    in 0..12 -> 15
                    in 13..60 -> if (isMonday) 25 else 30
                    in 61..100 -> 20
                    else -> -1
                }
            */
}