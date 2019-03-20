fun main(args: Array<String>) {
    //if is an expression not statement
    //**** STATEMENTS : program instruction that return no value; cant be on tight  side of euqals sign
    //EXPRESSION :  does have return a value

    val myReslt = if (10 < 11) "yes" else "no";//if as a expersstion and must have else because expresstion must have value in all cases
//    println(myReslt)
//-----------------------------------------------------------------------

    val temp = 80;

    val isAirConditionerOn = if (temp >= 80) {
        println("it is warm")
        true;//the return would be the last value
    }else{
        println("it is not so warm")
        false;
    }
//    println("is the airconditionner on : $isAirConditionerOn
//-----------------------------------------------------------------------
    //kotlin when statement replaces switch statement
    val burgerOrdered = 3;
    when(burgerOrdered){
        0 -> println("Not Hungry")
        1,2 -> println("Hungry")//combine conditions
        3 -> println("I'm Starving")
        in 5..10 -> println("We Are Starving")//we can also use range
        else ->{//default
            println("Are You Sure!!!")
        }
    }

    //when without arguments is like if else condition
    when{
        burgerOrdered <= 0 -> println("zero number can not be ordered")//we can use expression in our cases
        burgerOrdered % 2 == 1 -> println("Odd number ordered")
        burgerOrdered % 2 == 0 -> println("Even number ordered")
    }
}