fun main(args: Array<String>) {
    val obj1 = Cars("Vits", "Toyota",1990)
    val obj2 = Cars("Ford", "Mustang", 1990)
    println(obj2.year)
    println(obj1.brand)
    println(obj2.model)
    val person1 = person("Chola",18)
    person1.canVote(18)
    val person2 = person("Hanifa", 20)
    person2.canVote(20)
    val person3 = person("Tabitha",18)
    person3.canVote(18)
    val student1 = Student("Esther",85)
    student1.meangrade(85)
    val student2 = Student("James", 74)
    student2.meangrade(74)
    val product1 = product("Sugar",170.5, 2)
    product1.calculatetotalcost()
    println()
}
class Cars(val model:String,val brand:String, val year:Int) {
//    val model = ""
//    val brand = ""
//    val year = ""
}
class person(val name:String, val age:Int, ){
    fun canVote(age:Int){
        if(age<18){
            println("You cannot vote")
        }else{
            println("You can vote")
        }
    }
}
//write a kotlin function that creates a class called student with properties for name and grade. Include a function that checks if the student is qualified for promotion
class Student(val name: String,val grade:Int){
    fun meangrade(score:Int){
        if(score<75){
            println("You are below the required grade hence not qualified for promotion")
        }else{
            println("You are above the required grade hence qualified for promotion")
        }

    }
}
class product(
    val name:String,
    val price:Double,
    val quantity:Int
){
    fun calculatetotalcost():Double{
        return price* quantity
    }
}