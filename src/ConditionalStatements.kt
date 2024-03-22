import java.util.Scanner
fun main(args: Array<String>) {
    val age = 44
    if (age<18) {
        println("You are not qualified to vote")
    } else {
        println("You are legible to vote")
    }
    val number = 56
    if(number== 1){
        println("Oops you lost the game")
    }else if (number==2){
        println("Oops you're almost there")
    }else if (number==3){
        println("Congratulations you just won 1 match")
    }else {
        println("$number is not a valid number")
    }

//when statement
    var y =3
    when(y){
        1-> println("Oops you lost the game")
        2-> println("Oops you almost got it")
        3-> println("Sorry you were a little too late ")
        4-> println("Congratulation you won")
        else-> println("$y is not a valid number")
    }
//Using if else statement declare a height and weight variables.Perform the BMI using the two results and give the output respectively:
//if BMI is less than 18,output is underweight
//if BMI is 18-25: normal
//if BMI is 25-30 :overweight
// if BMI is above 30 : obese
    val read = Scanner(System.`in`)
    println("Enter your height: ")
    val height = read.nextFloat()
    println("Enter your weight: ")
    val weight = read.nextFloat()
    val BMI = weight/(height*height)
    println("this is your current $BMI")
    if (BMI<18){
        println("You are underweight")
    }else if(BMI<25) {
        println("you are normal")
    }else if (BMI<30){
        println("print you are overweight")
    }else{
        println("you are obese")
    }


}