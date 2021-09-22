fun main(args: Array<String>) {
    /*val myCar = Car()
    myCar.builder = "McLaren"
    println(myCar.builder)
    myCar.haveAPilot()*/

    var carsList = arrayListOf<Car>()
    carsList.add(Car("Ferrari", "Charles Leclerc"))
    carsList.add(Car("Mercedes", "Lewis Hamilton"))
    carsList.add(Car("Red Bull", "Verstappen"))
    carsList.add(Car("McLaren", "Lando Norris"))

    for (Car in carsList){
        println(Car.builder)
        println(Car.haveAPilot())
        println("-----------------------")
    }

}