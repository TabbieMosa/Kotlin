fun main(args: Array<String>) {
    Hello("Gerald")
    Hello("Sarah")
    Hello("Philip")
    Hello("Raphael")
    calculateAge(23)
    calculateAge(45)
    calculateAge(19)
    calculateAge(18)
    calculateAge1(2005,2024)
    calculateAge1(2004, 2024)
    println(add(12.5,15.9))
    println(birthdayGreeting("Dan", 19))
    println(area(14, 15))
    println(person("Daisy", 28))
    println(BMI())
    println(area1())
}
fun Hello(name: String){
    println("Hello $name")
}
fun calculateAge(age: Int){
    println("You are $age years old")
}
fun calculateAge1(birthyear: Int, currentyear: Int){
    println("You were born in the year $birthyear")
    println("we are in the year $currentyear")
}
fun add(num1: Double, num2: Double): Double {
    val summation = num1 +num2
    return summation
}
fun birthdayGreeting(name: String,age:Int): String{
    val a = "Hey $name"
    val b = "Congratulations you are now $age years old"
    return "$a\n$b"
}
//write a kotlin program that calculates the area of a rectangle. It should take length and width as arguments
fun area(length:Int, width:Int): Int{
    val c = length*width
    return c
}
fun person(name:String, age:Int, company: String="emobilis"): String{
    val profile = "Employee $name is $age years old and works at $company"
    return profile
}
fun BMI(weight: Double=56.2, height:Double=1.75):Double{
   val bmi = weight/(height*height)
   return bmi
}
fun area1(pi:Double=3.14, radius:Double=2.8):Double{
    val area2 = pi*radius*radius
    return area2
}
