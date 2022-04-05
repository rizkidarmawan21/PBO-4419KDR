import java.util.Scanner

class Function(){
    fun helloWorld(){
        println("======= helloWorld =======")
        println("Hello World")
    }

    fun operators(){
        // Arithmetic operators
        println("======= Arithmetic operators =======")
        val number1 = 12.5
        val number2 = 3.5
        var result: Double

        result = number1 + number2
        println("number1 + number2 = $result")

        result = number1 - number2
        println("number1 - number2 = $result")

        result = number1 * number2
        println("number1 * number2 = $result")

        result = number1 / number2
        println("number1 / number2 = $result")

        result = number1 % number2
        println("number1 % number2 = $result")

        // example Concat of string
        println("======= Concat of string =======")
        val start = "Talk is cheap. "
        val middle = "Show me the code. "
        val end = "- Linus Torvalds"

        val result2 = start + middle + end
        println(result2)

        // Here's a table of arithmetic operators and their corresponding functions:
        println("======= Arithmetic operators singkatan =======")
        val aa = 1
        val bb = 3
        println(aa.plus(bb))
        println(aa.minus(bb))
        println(aa.times(bb))
        println(aa.div(bb))
        println(aa.rem(bb))

        //Assignment Operators
        println("======= Assignment Operators =======")
        var number = 12

        number *= 5   // number = number*5
        println("number  = $number")

        // unary operator
        println("======= unary operator =======")
        val a = 1
        val b = true
        var c = 1

        var result3: Int
        var booleanResult: Boolean

        result3 = -a
        println("-a = $result3")

        booleanResult = !b
        println("!b = $booleanResult")

        --c
        println("--c = $c")

        //Comparison and Equality Operators
        println("======= Comparison and Equality Operators =======")
        val a1 = -12
        val b1 = 12

        // use of greater than operator
        val max = if (a1 > b1) {
            println("a is larger than b.")
            a1
        } else {
            println("b is larger than a.")
            b1
        }

        println("max = $max")

        //logical operators
        println("======= logical operators =======")

        val a2 = 10
        val b2 = 9
        val c2 = -1
        val result4: Boolean

        // result is true is a is largest
        result4 = (a2>b2) && (a2>c2) // result = (a>b) and (a>c)
        println(result4)

        // in Operator
        println("======= in Operator =======")
        val numberss = intArrayOf(1, 4, 42, -3)

        if (4 in numberss) {
            println("numbers array contains 4.")
        }

        //Index access Operator
        println("======= Index access Operator =======")
        val a4  = intArrayOf(1, 2, 3, 4, - 1)
        println(a4[1])
        a4[1]= 12
        println(a4[1])

        //Invoke Operator
        println("======= Invoke Operator =======")
        val a5 = intArrayOf(1, 2, 3, 4, - 1)
    }

    fun typeData(){
        println("========= Type Data ========")
        var language: String
        language = "Kotlin"
        println(language)

        val score: Int = 100
        println(score)

        val marks = 12.3
        println(marks)

        // byte
        val range: Byte = 10
        println(range)

        // short
        val range2: Short = 10
        println(range2)

        // int
        val range3: Int = 10
        println(range3)

        // long
        val range4: Long = 100L
        println(range4)

        // double
        val range5: Double = 10.0
        println(range5)

        // float
        val range6: Float = 10.0f
        println(range6)

//        =====================================
        var test: Number = 12.2
        println("$test")

        test = 12
        // Int smart cast from Number
        println("$test")

        test = 120L
        // Long smart cast from Number
        println("$test")

        // =====================================

        // char
        val char: Char = 'A'
        println(char)

        // boolean
        val bool: Boolean = true
        println(bool)

        // string
        val str: String = "Hello World"
        println(str)

    }

    fun ExpressionStatementsAndBlocks(){
        val score: Int
        score = 90 + 25
        println(score)

        val a = 12
        val b = 13
        val max: Int

        max = if (a > b) a else b
        println("$max")

        //Kotlin Statements
        val score2 = 90 + 25

        // kotlin block
        val flag = true

        if (flag == true) {      // start of if block
            print("Hey ")
            print("jude!")
        }
    }

    fun inputOutput(){
        println("========= Input Output ========")
        // input
        println("Enter your name: ")
        val name = readLine()
        println("Hello $name")

        // output
        println("Enter your name: ")
        val name2 = readLine()
        println("Hello $name2")

        // output
        println("Enter your name: ")
        val name3 = readLine()
        println("Hello $name3")

        // output
        println("Enter your name: ")
        val name4 = readLine()
        println("Hello $name4")

        // output
        println("Enter your name: ")
        val name5 = readLine()
        println("Hello $name5")

        // output
        println("Enter your name: ")
        val name6 = readLine()
        println("Hello $name6")

        // output
        println("Enter your name: ")
        val name7 = readLine()
        println("Hello $name7")

        // output
        println("Enter your name: ")
        val name8 = readLine()
        println("Hello $name8")

        // output
        println("Enter your name: ")
        val name9 = readLine()
        println("Hello $name9")

        // output
        println("Enter your name: ")
        val name10 = readLine()
        println("Hello $name10")

        // output
        println("Enter your name: ")
        val name11 = readLine()
        println("Hello $name11")

        // output
        println("Enter your name: ")
        val name12 = readLine()
        println("Hello $name12")

        // output
        println("Enter your name: ")
        val name13 = readLine()
        println("Hello $name13")

        // output
        println("Enter your name: ")
        val name14 = readLine()
        println("Hello $name14")

        // output
        println("Enter your name: ")
        val name15 = readLine()
        println("Hello $name15")

        // output
        println("Enter your name: ")

        //Getting Integer Input from the User
        // Creates an instance which takes input from standard input (keyboard)
        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        // nextInt() reads the next integer from the keyboard
        var integer:Int = reader.nextInt()

        println("You entered: $integer")
    }
}


fun main(args: Array<String>) {
    val fungsi = Function()
    fungsi.helloWorld()
    fungsi.typeData()
    fungsi.operators()
    fungsi.ExpressionStatementsAndBlocks()
    fungsi.inputOutput()

//    Conversion from Larger to Smaller Type
    val number1: Int = 545344
    val number2: Byte = number1.toByte()
    println("number1 = $number1")
    println("number2 = $number2")

}