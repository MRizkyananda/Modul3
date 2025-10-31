public class PembayaranApp {
    public static void main(String[] args) {
        // 6. Simplify Object Creation - langsung inisialisasi lewat constructor
        Pembeli pembeli = new Pembeli("Rina", "Laptop", 8500000, 0.1);

        // Panggil method yang sudah dirapikan
        pembeli.cetakStruk();
        pembeli.pesanTerimaKasih();
    }
}