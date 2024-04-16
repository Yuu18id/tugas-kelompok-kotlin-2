data class Kontak(
    val nama: String,
    val nomor: String,
    val email: String
)

class PengelolaKontak {
    private val daftarKontak = mutableListOf<Kontak>()

    fun tambahKontak(kontak: Kontak) {
        daftarKontak.add(kontak)
        println("Kontak ${kontak.nama} berhasil ditambahkan.")
    }

    fun hapusKontak(namaKontak: String) {
        val kontakDihapus = daftarKontak.find { it.nama == namaKontak }
        kontakDihapus?.let {
            daftarKontak.remove(it)
            println("Kontak dengan nama $namaKontak berhasil dihapus.")
        } ?: println("Kontak dengan nama $namaKontak tidak ditemukan.")
    }

    fun tampilkanKontak() {
        println("\nDaftar Kontak")
        for (kontak in daftarKontak) {
            println("Nama\t: ${kontak.nama}\nNomor\t: ${kontak.nomor}\nEmail\t: ${kontak.email}\n")
        }
    }
}

// Fungsi ekstensi
fun Kontak.cetakInformasi(){
    println("<= Hasil ini di print menggunakan fungsi ekstensi =>")
    println("Nama\t: $nama\nNomor\t: $nomor\nEmail\t: $email\n")
}

//testing
fun main() {
    val kon1 = Kontak("Bayu", "12345", "bayu@gmail.com")
    val kon2 = Kontak("Haidar", "09876", "haidar@gmail.com")
    val pengelolaKontak = PengelolaKontak()

    pengelolaKontak.tambahKontak(kon1)
    pengelolaKontak.tambahKontak(kon2)
    pengelolaKontak.tampilkanKontak()

    pengelolaKontak.hapusKontak("Haidar")
    pengelolaKontak.tampilkanKontak()

    // Dengan menggunakan extension function
    kon1.cetakInformasi()
    kon2.cetakInformasi()
}
