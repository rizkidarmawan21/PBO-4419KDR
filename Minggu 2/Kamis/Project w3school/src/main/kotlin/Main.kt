//fun main(args: Array<String>) {
//    println("Hello World!")
//    println("Rizki")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

fun main() {
    println("====================== Learn Output ====================")
    println("Hello World!")
    println("I am learning Kotlin.")
    println("It is awesome!")

    println("====================== Learn Variabel ====================")
    // Learn Variabel

    var name = "John"
    val birthyear = 1975

    println(name)
    println(birthyear)


    println("====================== Learn Type Data ====================")
    // learn type data
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String
    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    println("====================== Learn operator  ====================")
    var sum1 = 100 + 50        // 150 (100 + 50)
    var sum2 = sum1 + 250      // 400 (150 + 250)
    var sum3 = sum2 + sum2     // 800 (400 + 400)
    println(sum1)
    println(sum2)
    println(sum3)

    println("====================== Learn string  ====================")
    var greeting: String = "Hello"
    println(greeting);
    println(greeting.get(0));
    println(greeting.get(1));
    println(greeting.get(2));

    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt.length)

    var txt2 = "Hello World"
    println(txt2.toUpperCase())   // Outputs "HELLO WORLD"
    println(txt2.toLowerCase())   // Outputs "hello world"

    var txt3 = "Hello World"
    var txt4 = "Hello World"
    println(txt3.compareTo(txt4))  // Outputs 0 (they are equal)

    var txt5 = "Please locat where 'locate' occurs!"
    println(txt5.indexOf("locate"))  // Outputs 7

    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println(firstName.plus(lastName))
    println("My name is $firstName $lastName")

    println("====================== Learn boolean  ====================")

    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    val x = 10
    val y = 9
    println(x > y) // Returns true, because 10 is greater than 9
    println(x < y) // Returns false, because 10 is not less than 9
    println(x == 10); // Returns true, because the value of x is equal to 10

    println(10 == 15); // Returns false, because 10 is not equal to 15

    println("====================== Learn if else  ====================")
//    if else
    val a = 10
    val b = 20
    if (a > b) {
        println("a is greater than b")
    } else {
        println("a is not greater than b")
    }

    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."

    val greetingg = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greetingg)

    val greetingg2 = if (time < 18) "Good day." else "Good evening."
    println(greetingg2)

    println("====================== Learn when  ====================")
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    println("====================== Learn while loop  ====================")
    // while loop

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    // DO while loop
    var j = 0
    do {
        println("while do $j")
        j++
    } while (j < 5)

    println("====================== Learn break and continue  ====================")

//    break
    var h = 0
    while (h < 10) {
        println(h)
        h++
        if (h == 4) {
            break
        }
    }

    // continue
    var k = 0
    while (k < 10) {
        k++
        if (k == 4) {
            continue
        }
        println(k)
    }

    println("====================== Learn arrays  ====================")
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    cars[0] = "Opel"
    println(cars[0])
// Now outputs Opel instead of Volvo

    println(cars.size)

    // check if an element exists in an array
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    //Loop Through an Array
    for (car in cars) {
        println(car)
    }

    //Loop Through an Array with Index
    for (index in cars.indices) {
        println("Car at index $index is ${cars[index]}")
    }

    println("====================== Learn for loop  ====================")
    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    print("====================== Learn ranges  ====================")
    // ranges
    for (x in 1..10) {
        println(x)
    }

    // Check if a Value Exists
    val nums1 = arrayOf(2, 4, 6, 8)
    if (2 in nums1) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    // break and continue a range
    for (x in 1..10) {
        if (x == 5) {
            break
        }
        println(x)
    }


    println("====================== Learn collections  ====================")
    val list = listOf("a", "b", "c")
    println(list)


    println("====================== Learn function  ====================")
    // call function
    myFunction()
    myFunction2("Hello")
    myFunction3("Rizki", 20)

    var resultFunction = myFunction4(10, 20)
    println(resultFunction)

    var resultFunction2 = myFunction5(30, 20)
    println(resultFunction2)


}

// create function MyFunction

fun myFunction() {
    println("I just got executed!")
}

fun myFunction2(fname: String) {
    println(fname + " Doe")
}

// multiple parameters
fun myFunction3(fname: String, age: Int) {
    println("$fname is $age years old")
}


// return value
fun myFunction4(a: Int, b: Int): Int {
    return a + b
}

// Shorter Syntax for Return Values
fun myFunction5(a: Int, b: Int) = a + b