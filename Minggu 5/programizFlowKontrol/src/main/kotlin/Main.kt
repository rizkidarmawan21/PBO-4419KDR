class FlowControl(){
    // if expression
    fun ifExpression(){
        println("========== if expression ==========")
        val a = 1
        val b = 2
        val max = if (a > b) a else b
        println(max)

        // if else expression
        println("========== if else expression ==========")
        val max2 = if (a > b) {
            println("Choose a")
            a
        } else {
            println("Choose b")
            b
        }

        //if block With Multiple Expressions
        println("========== if block With Multiple Expressions ==========")
        val max3 = if (a > b) {
            println("Choose a")
            println("Choose a")
            println("Choose a")
            a
        } else {
            println("Choose b")
            println("Choose b")
            println("Choose b")
            b
        }

        // nested if expression
        val n1 = 3
        val n2 = 5
        val n3 = -2

        val max22 = if (n1 > n2) {
            if (n1 > n3)
                n1
            else
                n3
        } else {
            if (n2 > n3)
                n2
            else
                n3
        }

        println("max = $max22")
    }

    fun whenExpression(){
        //simple when expression
        println("========== simple when expression ==========")
        val a = 12
        val b = 5

        println("Enter operator either +, -, * or /")
        val operator = readLine()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> "$operator operator is invalid operator."
        }

        println("result = $result")

        // few possible values
        println("========== few possible values ==========")
        val n = -1

        when (n) {
            1, 2, 3 -> println("n is a positive integer less than 4.")
            0 -> println("n is zero")
            -1, -2 -> println("n is a negative integer greater than 3.")
        }

        // check value in the range with when
        println("========== check value in the range with when ==========")
        val n2 = 5
        when (n2) {
            in 1..10 -> println("n2 is in the range of 1 to 10")
            in 11..20 -> println("n2 is in the range of 11 to 20")
            else -> println("n2 is not in the range of 1 to 20")
        }

        // check if a value is of a paticular type
        println("========== check if a value is of a paticular type ==========")
        val aa = 11
        val nn = "11"

        when (nn) {
            "cat" -> println("Cat? Really?")
            12.toString() -> println("Close but not close enough.")
            aa.toString() -> println("Bingo! It's eleven.")
        }
    }

    fun whileLoop(){
        println("========== while loop ==========")
        var i = 0
        while (i < 10) {
            println("i = $i")
            i++
        }

        // do while loop
        println("========== do while loop ==========")
        var j = 0
        do {
            println("j = $j")
            j++
        } while (j < 10)

        // while loop with break
        println("========== while loop with break ==========")
        var k = 0
        while (k < 10) {
            println("k = $k")
            k++
            if (k == 5) {
                break
            }
        }

        var sum = 0
        var i1 = 100

        while (i1 != 0) {
            sum += i1     // sum = sum + i;
            --i1
        }
        println("sum = $sum")
    }

    fun forLoop(){
        // for
        println("========== for loop ==========")
        for (i in 1..10) {
            println("i = $i")
        }

        // for with step
        println("========== for with step ==========")
        for (i in 1..10 step 2) {
            println("i = $i")
        }

        // for with downTo
        println("========== for with downTo ==========")
        for (i in 10 downTo 1) {
            println("i = $i")
        }

        // for with downTo with step
        println("========== for with downTo with step ==========")
        for (i in 10 downTo 1 step 2) {
            println("i = $i")
        }

        //Example: Different Ways to Iterate Through a Range
        println("========== Different Ways to Iterate Through a Range ==========")
        print("for (i in 1..5) print(i) = ")
        for (i in 1..5) print(i)

        println()

        print("for (i in 5..1) print(i) = ")
        for (i in 5..1) print(i)             // prints nothing

        println()

        print("for (i in 5 downTo 1) print(i) = ")
        for (i in 5 downTo 1) print(i)

        println()

        print("for (i in 1..5 step 2) print(i) = ")
        for (i in 1..5 step 2) print(i)

        println()

        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2) print(i)


        // for array
        println("========== for array ==========")
        val array = arrayOf(1, 2, 3, 4, 5)
        for (i in array) {
            println("i = $i")
        }

        var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

        for (item in language.indices) {

            // printing array elements having even index only
            if (item%2 == 0)
                println(language[item])
        }

        //Iterating Through a String
        println("========== Iterating Through a String ==========")
        val name = "Kotlin"
        for (c in name) {
            println(c)
        }

        for (item in name.indices) {
            println(name[item])
        }

    }

    fun breakExpression(){
        //break expression
        println("========== break expression ==========")
        for (i in 1..10) {
            if (i == 5) {
                break
            }
            println("i = $i")
        }

        //Example: Calculate Sum Until User enters 0
        println("========== Calculate Sum Until User enters 0 ==========")
        var sum = 0
        var i = 1
        while (i != 0) {
            print("Enter a number: ")
            i = readLine()!!.toInt()
            sum += i

            if (i == 0)
                break
                sum += i
        }
        println("Sum = $sum")

        //Kotlin Labeled break
        println("========== Kotlin Labeled break ==========")
        first@ for (i in 1..4) {

            second@ for (j in 1..2) {
                println("i = $i; j = $j")

                if (i == 2)
                    break@first
            }
        }
        println("================")

        first@ for (i in 1..4) {

            second@ for (j in 1..2) {
                println("i = $i; j = $j")

                if (i == 2)
                    break@second
            }
        }
    }

    fun Continue(){
        for (i in 1..5) {
            println("$i Always printed.")
            if (i > 1 && i < 5) {
                continue
            }
            println("$i Not always printed.")
        }

        //Example: Calculate Sum of Positive Numbers Only
        println("========== Calculate Sum of Positive Numbers Only ==========")
        var number: Int
        var sum = 0

        for (i in 1..6) {
            print("Enter an integer: ")
            number = readLine()!!.toInt()

            if (number <= 0)
                continue

            sum += number
        }
        println("sum = $sum")

        //Kotlin Labeled continue
        println("========== Kotlin Labeled continue ==========")
        first@ for (i in 1..4) {

            second@ for (j in 1..2) {
                println("i = $i; j = $j")

                if (i == 2)
                    continue@first
            }
        }
    }
}


fun main(args: Array<String>) {
    val flowControl = FlowControl()
    flowControl.ifExpression()
    flowControl.whenExpression()
    flowControl.whileLoop()
    flowControl.forLoop()
    flowControl.breakExpression()
    flowControl.Continue()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}