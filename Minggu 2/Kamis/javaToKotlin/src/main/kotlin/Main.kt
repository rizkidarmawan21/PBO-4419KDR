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