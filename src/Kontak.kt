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

    fun hapusKontak(namaKontak: String) {
        val kontakDihapus = daftarKontak.find { it.nama == namaKontak }
        kontakDihapus?.let {
            daftarKontak.remove(it)
            println("Kontak dengan nama $namaKontak berhasil dihapus.")
        } ?: println("Kontak dengan nama $namaKontak tidak ditemukan.")
    }
}