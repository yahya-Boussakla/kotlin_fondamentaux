fun main()
{
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")


    println(solarSystem)
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.contains("Pluto"))
    solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem)
}