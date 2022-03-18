class matematika(){
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }
    fun kurang(a: Int, b: Int): Int {
        return a - b
    }
    fun kali(a: Int, b: Int): Int {
        return a * b
    }
    fun bagi(a: Int, b: Int): Int {
        return a / b
    }
}

fun main(args: Array<String>) {
    val matematika = matematika()
    println("Hasil penjumlahan: ${matematika.tambah(10, 5)}")
    println("Hasil pengurangan: ${matematika.kurang(10, 5)}")
    println("Hasil perkalian: ${matematika.kali(10, 5)}")
    println("Hasil pembagian: ${matematika.bagi(10, 5)}")
}