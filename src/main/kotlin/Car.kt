class Car : RaceCar {

    var pilot : String = ""
    var carStatus : CarStatus = CarStatus.FREE

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

    constructor(builder: String){
        this.builder = builder
    }
}

interface RaceCar{
    fun haveAPilot()
}

enum class CarStatus(){
    BROKEN, FREE, ENGAGED
}