fun main(args: Array<String>) {
    val arr1 = arrayOf(13,"Students", 12.4,'d')
    val arr2 = arrayOf<Int>(366,225,147)
    val arr3 = arrayOf<String>("Toniah","Gabriel" ,"Kevin", "Joan", "Joel")
    val arr4 = arrayOf<Double>(12.4, 13.2, 14.5)

    println(arr1[1])
    println(arr4[2])
    println(arr3[3])
    println(arr1[3])
//modifying an array
    arr1[0] = 25
    println(arr1[0])
    arr3[0] = "Stephen"
    println(arr3[0])
//modifying an array using a set function
    val fruits = arrayOf("Mangoes", "Bananas", "Apples", "Oranges", "Grapes")
    println(fruits[1])
    fruits.set(1, "Pineapple")
    println(fruits[1])
    fruits.set(0, "Kiwi")
    println(fruits[0])
//get function
    val cars = arrayOf("Benz", "Toyota", "Lamborghini")
    println(cars[0])
    println(cars.get(0))
//create an array of employees and use the set and get function to modify and fetch any of the two value within it
    val emp = arrayOf<String>("Tony", "Peter", "Ian", "Keith")
    println(emp[0])
    emp.set(0, "Sarah")
    println(emp[0])
    println(emp.get(0))

}