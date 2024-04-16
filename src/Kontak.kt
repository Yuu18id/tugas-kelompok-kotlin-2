data class Kontak(
    val nama: String,
    val nomor: String,
    val email: String
)

class PengelolaKontak {
    private val daftarKontak = mutableListOf<Kontak>()

    fun tambahKontak(kontak: Kontak) {
        daftarKontak.add(kontak)
    }
s