fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()
    val dog1 = dog("Black", 13)
    dog1.woof()
    val cat1 = cat("White", 12)
    cat1.meow()
    val cow1 = cow("brown", 13)
    cow1.moo()
    val horse1 = horse("Black", 16)
    horse1.mhihehehehe()
}
open class Parent(){
    val x = 49
}
class Child:Parent(){
    fun myfunction(){
        println(x)
    }
}
open class Animal(val color:String,val age:Int){
    init{
        println("Color is $color")
        println("Age is $age")
    }
}
class dog(color: String, age:Int):Animal(color,age){
    fun woof(){
        println("The dog makes a woof sound")
    }
}
class cat(color:String,age:Int):Animal(color,age){
    fun meow(){
        println("The cat purrs")
    }
} class cow(color:String,age:Int):Animal(color,age){
    fun moo(){
        println("The cows moos")
    }
}
class horse(color:String,age:Int):Animal(color,age){
    fun mhihehehehe(){
        println("A horse makes the sound mhiheheheh")
    }
}
open class Sportsperson(val name:String, val age:Int){
    init{
        println("You are $name")
        println("You are $age years old")
    }
}
class Footballer(name:String,age:Int,club:String):Sportsperson(name,age){
    fun player() {
        println("I am playing football")
    }
}
class volleyballer(name:String,age:Int, club:String):Sportsperson(name,age){
    fun volley(){
        println("I am playing volleyball")
    }
}