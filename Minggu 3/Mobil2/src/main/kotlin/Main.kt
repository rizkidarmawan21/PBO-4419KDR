open class Mobil() {
    fun warnaMobil(warna: String) {
        println("Mobil ini berwarna $warna")
    }

    fun tahunMobil(tahun: Int) {
        println("Mobil ini berwarna $tahun")
    }
}

class Mobil2() : Mobil() {
    fun hidupkanMobil() {
        println("Mobil menyala")
    }

    fun ubahGigi(gigi: String) {
        println("Mobil mengubah gigi ke $gigi")
    }

    fun matikanMobil() {
        println("Mobil mati")
    }
}


fun main(args: Array<String>) {
    println("=====Mobil2=====")
    var mobil = Mobil2()
    mobil.warnaMobil("Hijau")
    mobil.tahunMobil(2022)
    mobil.hidupkanMobil()
    mobil.ubahGigi("R")
    mobil.matikanMobil()
}