fun main(args: Array<String>) {
    /*val myCar = Car()
    myCar.builder = "McLaren"
    println(myCar.builder)
    myCar.haveAPilot()*/

    /*var carsList = arrayListOf<Car>()
    carsList.add(Car("Ferrari", "Charles Leclerc"))
    carsList.add(Car("Mercedes", "Lewis Hamilton"))
    carsList.add(Car("Red Bull", "Verstappen"))
    carsList.add(Car("McLaren", "Lando Norris"))

    for (Car in carsList){
        println(Car.builder)
        println(Car.haveAPilot())
        println("-----------------------")
    }*/

    val car : Car = Car("Fiat")
    car.carStatus = CarStatus.FREE

    when (car.carStatus){
        CarStatus.FREE -> {
            println("You can take this car")
        }
        CarStatus.BROKEN -> {
            println("Sorry, this car is not working")
        }
        CarStatus.ENGAGED -> {
            println("Sorry, someone already took this car")
        }
    }

}