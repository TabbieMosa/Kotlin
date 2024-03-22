fun main(args: Array<String>) {
    1..10
    1.rangeTo(10)
    val myvariables = 20..50
    for (variables in myvariables) {
        println(variables)
    }
        val var2 = 1..21
        for (varr in var2){
            println(varr)

    }
    val alpha = 'A'..'Z'
    for (a in alpha){
        println(a)
    }
    val var3 = 'A'..'P'
    for(a in var3){
        println(a)
    }
    val var4 = 19.downTo(1)
    for(one in var4){
        println(one)
    }
    val marks = 1.rangeTo(10)
    marks.step(3)
    for(d in marks.step(3)){
        println(d)
    }
    for(e in marks.step(5)){
        println(e)
    }
    val varr6 = 200..500
    varr6.step(10)
    for(f in varr6.step(10)){
        println(f)
    }
}