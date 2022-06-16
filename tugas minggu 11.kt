
fun convertTime(number: Int){
    var jam = number / 3600 ;
    println(jam)
    var menit = (number % 3600) / 60 ;
    println(menit)
    var detik = (number % 3600) % 60 ;
    println(detik)
    println(" ${jam} Jam ${menit} Menit ${detik} Detik ")
}

fun sortArray(array1: Array<Int>, array2: Array<Int>){
    var items = mutableListOf<Int>() ;

    for(data in array1)
        items.add(data)
    for(data in array2)
        items.add(data)

    items.sort()

//        for(i in 0..items.size)
//            println("data i "+i)
//            if(i > 2)
//                println("i lebih besar dari 2")
//            //0
//            //1
//            //2
//            //3
//            for(j in 0..items.size-1 )
////                println("data j = $j  data i =$i")
//                if(j > 2)
////                    var simpanSementara = items[j+1];
////                    items[j+1] = items[j];
////                    items[j] = simpanSementara;
//                    println("Item sebelumnya lebih besar dari item sesudah")
//



    println(items)
}

fun main() {
    println("=========== Convert Time =============")
    convertTime(3667);
    println("=========== Sort Array and Merge =============")
    sortArray(arrayOf(1,2,3,4),arrayOf(2,1));
}
