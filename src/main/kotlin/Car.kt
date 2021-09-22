class Car : RaceCar {

    var pilot : String = ""

    var builder : String = ""
        get() {
            return "$field builder"
        }
        set(value) {
            field = "$value Motors"
        }

    override fun haveAPilot() {
        println("My pilot is $pilot")
    }

    constructor(builder: String, pilot: String){
        this.builder = builder
        this.pilot = pilot
    }
}

interface RaceCar{
    fun haveAPilot()
}