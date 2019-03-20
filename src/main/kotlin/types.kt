fun main(args: Array<String>) {
    //INTEROPERABILITY IS KEY LANGUAGE GOAL OF KOLIN
    //val is value it does not change, var is not
    //in function programming immutable are thread safe
    //kotlin is type infrence

    val isConstant = 10;//knows that isConstant is an Int
    var isVariable = 12;
    isVariable = 23;

    var username = "AmirahmadAdibi";
    val myPi = 3.14;
    val myAnswer = 42;
    var string:String;//you have initiate  either with value or type


    var myDouble = 1.9999;
    var myFloat = 1.9f;
    var myLong = 12263452323187923L;
    var short : Short = 10;//there is no abbrivation for short;
    var myByte : Byte = 127;


    val myLongNumber = 123_456_543L;//equal to this 123456789

    val anInt = 123;
    val aLong:Long = anInt.toLong();//kotlin wants you to be specific in conversion


}