class Person (firstname:String,lastNmae:String){
    init {
        println("Creating a person named $firstname $lastNmae")
    }

    constructor(firstname: String,lastname: String,middleNmae:String):this(firstname,lastname){

    }
}

//we have to use constructor key work when we want to use access modifire or
class Employee internal constructor(name:String,lastname:String){

}