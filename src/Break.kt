fun main(args: Array<String>) {
    for(a in 1..5){
        println("$a")
        if (a==7){
            println("I am terminating the loop")
            break
        }
    }
}