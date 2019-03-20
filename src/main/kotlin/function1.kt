fun main(args: Array<String>) {
    myDefault(param1 = 10,message = "amirahmad");//also we can use named arguments
}

fun myFunction(num1:Int ,num2: Int):Int{
    return num1 + num2;
}

fun myFunction1(num1:Int ,num2: Int):Int = num1 + num2;//expression body function

//because the two arguments are int the tyep of function will be infered
fun myFunction2(num1:Int ,num2: Int) = num1 + num2;//expression body function


//also we can use functions with default values
fun myDefault(param1:Int = 5,param2:Int = 10,message:String = "Hi"):Int{
    val result = param1 + param2;
    println(message)
    return result
}
