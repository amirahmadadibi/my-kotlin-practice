fun main(args: Array<String>) {
    val person = Person("Amirahmad","Adibi")
    //in kotlin objects do not need class to create them
    //objects can include filed and methods
    val location = object {
        var xPosition = 200;
        var yPosition = 400;
        fun printIt(){
            println("Position = ($xPosition, $yPosition)")

        }
    }
    location.printIt();

    val car = Car("mycar");
    car.go()
}