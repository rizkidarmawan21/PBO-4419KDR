//fun main(args: Array<String>) {
////    println("Hello World!")
////
////    // Try adding program arguments via Run/Debug configuration.
////    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//
//    println("=========================== Learn Class And Object ===========================")
//
//    // create a class
//    class Car {
//        var brand = ""
//        var model = ""
//        var year = 0
//    }
//
//
//    // Create a c1 object of the Car class
//    val c1 = Car()
//
//// Access the properties and add some values to it
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    println(c1.brand)   // Outputs Ford
//    println(c1.model)   // Outputs Mustang
//    println(c1.year)    // Outputs 1969
//
//    println("Program arguments: ${args.joinToString()}")
//
//
//    println("=========================== Multiple Object ===========================")
//    val c11 = Car()
//    c11.brand = "Ford"
//    c11.model = "Mustang"
//    c11.year = 1969
//
//    val c2 = Car()
//    c2.brand = "BMW"
//    c2.model = "X5"
//    c2.year = 1999
//
//    println(c11.brand)  // Ford
//    println(c2.brand)  // BMW
//
//
//
//}

//
//class CarNew {
//    var brand = ""
//    var model = ""
//    var year = 0
//}
//
//fun main() {
//    println("=========================== Kotlin Constructors ===========================")
//    val c1 = CarNew()
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    println(c1.brand)   // Outputs Ford
//    println(c1.model)   // Outputs Mustang
//    println(c1.year)    // Outputs 1969
//
//}

// Example for Constructor
//class Car(var brand: String, var model: String, var year: Int)
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//    println(c1.brand)   // Outputs Ford
//    println(c1.model)   // Outputs Mustang
//    println(c1.year)    // Outputs 1969
//}


// Example for Constructor multiple object
//class Car(var brand: String, var model: String, var year: Int)
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//    val c2 = Car("BMW", "X5", 1999)
//    val c3 = Car("Tesla", "Model S", 2020)
//
//    println(c1.brand)
//    println(c2.brand)
//    println(c3.brand)
//}

// Kotlin Class Functions ==============================================================

//class Car(var brand: String, var model: String, var year: Int) {
//    // Class function
//    fun drive() {
//        println("Wrooom!")
//    }
//}
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//
//    // Call the function
//    c1.drive()
//}


// Class Fuctions with parameters ==============================================================
//class Car(var brand:String,var model:String,var year:Int){
//    fun drive(){
//        println("Wrooom!")
//    }
//
//    fun speed(maxSpeed:Int){
//        println("Max speed is: " + maxSpeed)
//        println("Max speed is $maxSpeed")
//    }
//}
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//
//    // Call the function
//    c1.drive()
//    c1.speed(200)
//}

//=========================== Kotlin Inheritance (Subclass and Superclass) ===========================")

// SuperClass
//open class MyParentClass {
//    val x = 100
//}
//
//// Subclass
//class MyChildClass: MyParentClass() {
//    fun myFunction() {
//        println("Isi X dari parent adalah $x") // x is now inherited from the superclass
//    }
//}
//
//fun main(){
//    val myObj = MyChildClass()
//    myObj.myFunction()
//}

class mobil {
    var warna: String = ""
    var tahun: Int = 0

}
fun main(){
    val mobil1 = mobil()
    mobil1.warna = "Hijau"
    mobil1.tahun = 2022
    println("Warna Mobil : ${mobil1.warna}")
    println("Tahun Mobil : ${mobil1.tahun}")

}