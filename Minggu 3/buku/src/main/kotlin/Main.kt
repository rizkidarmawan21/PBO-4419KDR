class buku(){
    var judul: String = ""
    var pengarang: String = ""
    var penerbit: String = ""
    var tahun: Int = 0

    // create contructor for judul,pengarang, penerbit, tahun
    constructor(judul: String, pengarang: String, penerbit: String, tahun: Int): this(){
        this.judul = judul
        this.pengarang = pengarang
        this.penerbit = penerbit
        this.tahun = tahun
    }

    // create method for print
    fun cetakBuku(){
        println("Judul: $judul")
        println("Pengarang: $pengarang")
        println("Penerbit: $penerbit")
        println("Tahun: $tahun")
    }
}

fun main(args: Array<String>) {
    // create object buku
    val buku1 = buku("Kotlin dasar", "Dwi", "Gramedia", 2019)
    buku1.cetakBuku()
    println(" ")
    val buku2 = buku("Programmer Zaman Now", "Hilman", "Gramedia", 2022)
    buku2.cetakBuku()
}