//fun factorial(num: Int): Long {
//    var result = 1L
//    for (i in 2..num){
//        println("$result x "+ i)
//        result = result * i
//    }
////    1 x 2
////    2 x 3
////    6 x 4
////    24 X 5
////    120
//    return result
//}
//
//fun polindrom(num: Int){
//    var num = num
//    var reversedInteger = 0
//    var remainder: Int
//    val originalInteger: Int
//
//    originalInteger = num
//
//    while (num != 0) {
//        remainder = num % 10
//        reversedInteger = reversedInteger * 10 + remainder
//        num /= 10
//    }
//
//    if (originalInteger == reversedInteger)
//        println("$originalInteger is true")
//    else
//        println("$originalInteger is false")
//}
//
//fun searchArray(array: Array<Int>, search: Int){
//    for (i in array) {
//        if (i % 3 === 0){
//            println("Element $i ditemukan di index ke "+ array.indexOf(i) +" merupakan kelipatan bilangan $search.")
//        }
//    }
//}
//
//
//fun main(args: Array<String>) {
//    println("===== Polindrome =====")
//    polindrom(1234321)
//    println("===== Factiorial =====")
//    println(factorial(4))
//    println("===== Search Array =====")
//    println(searchArray(arrayOf(10,33,24,21,20),3))
//
//}
