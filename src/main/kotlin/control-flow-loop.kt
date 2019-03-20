fun main(args: Array<String>) {
    var x =0;
    while (x <10){
//        println("x is $x");
        x++;
    }

    do{
        println("x is $x form do while");
        x++
    }while (x < 20)


    for (item in 1..10){
        print("$item , ")
    }
    for (ch in "AmirahmadAdibi"){
        print("$ch ")
    }
    println()

    //iterate arrays with for loop
    val myArray = arrayOf(10,20,30,40);
    for (item in myArray.indices){
        println("$item is : ${myArray[item]}")
    }
}