class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
        
    fun turnOn()
        {
            println("Hello World");
        }
    fun turnOff()
        {
            
        }
    
}
fun main()
{
    val dog = SmartDevice("haja","abdel");
    dog.turnOn();
}