fun main(args: Array<String>) {
    val myCar = Car()
    myCar.builder = "McLaren"
    println(myCar.builder)
    myCar.haveAPilot()
}

class Car: RaceCar{
    var builder : String = ""
        get() {
            return "Builder $field"
        }
        set(value) {
            field = "$value Motors"
        }

    override fun haveAPilot() {
        println("My pilot is Lando Norris")
    }
}

interface RaceCar{
    fun haveAPilot()
}