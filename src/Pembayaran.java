/**
 * Kelas utama {@code PembayaranApp} digunakan untuk menjalankan program utama.
 *
 * <p>Kelas ini mendemonstrasikan hasil refactoring seperti
 * Simplify Object Creation dengan langsung menggunakan constructor.</p>
 *
 * @author Rizky
 * @version 1.0
 */
public class Pembayaran {

    /**
     * Metode utama (entry point) untuk menjalankan aplikasi pembayaran.
     * Membuat objek {@link Pembeli}, mencetak struk, dan menampilkan pesan terima kasih.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        // Simplify Object Creation - langsung inisialisasi lewat constructor
        Pembeli pembeli = new Pembeli("Rina", "Laptop", 8500000, 0.1);

        // Memanggil method hasil refactoring
        pembeli.cetakStruk();
        pembeli.pesanTerimaKasih();
    }
}
