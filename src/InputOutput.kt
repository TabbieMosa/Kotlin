import java.util.Scanner
fun main(args: Array<String>) {
    println("Please type your name here: ")
    val enteredname = readLine()
    println("You have entered yor name as $enteredname")

    println("Please enter your age: ")
    val enteredage =  Integer.valueOf(readLine())
    println("You are $enteredage years old")

    val read = Scanner(System.`in`)
    println("Enter your Physics score: ")
    val enteredmarks = read.nextInt()
    println("You scored $enteredmarks in physics")

    println("Please enter your BMI: ")
    val enteredBMI = read.nextFloat()
    println("Your BMI is Currently at $enteredBMI ")
//write an algorithm that takes two integer inputs from the user and converts them to floats. Then perform
//additon and subtraction using the same values
    println("First_Number: ")
    val numberone = read.nextFloat()
    println("Second_Number: ")
    val numbertwo = read.nextFloat()
    val add = numberone + numbertwo
    val minus = numberone - numbertwo
    println("Your Total sum is $add")
    println("Your reminder is $minus ")
}