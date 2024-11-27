open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}
class SmartTvDevice(deviceName: String, deviceCategory: String) :
      SmartDevice(deviceName,deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }
    fun increaseSpeakerVolume() {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }
    fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }
}
class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(deviceName,deviceCategory) {

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    fun increaseBrightness() {
            brightnessLevel++
            println("Brightness increased to $brightnessLevel.")
        }
}
fun main()
{
    val smarttvdevice = SmartTvDevice("Android TV","Entertainment");
    println(smarttvdevice.speakerVolume)
}   