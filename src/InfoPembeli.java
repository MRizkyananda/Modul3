/**
 * Kelas {@code Pembeli} merepresentasikan data dan perilaku seorang pembeli
 * dalam proses transaksi pembelian barang.
 *
 * <p>Kelas ini menerapkan beberapa teknik refactoring, seperti:
 * Encapsulation, Extract Method, Introduce Constructor, dan Rename Method.</p>
 *
 * @author Rizky
 * @version 1.0
 */
public class InfoPembeli {
    /** Nama pembeli */
    private String nama;

    /** Nama barang yang dibeli */
    private String barang;

    /** Harga barang yang dibeli */
    private double harga;

    /** Persentase diskon (contoh: 0.1 = 10%) */
    private double diskon;

    /**
     * Membuat objek Pembeli baru dengan data lengkap.
     *
     * @param nama nama pembeli
     * @param barang nama barang yang dibeli
     * @param harga harga barang
     * @param diskon persentase diskon (0 - 1)
     */
    public InfoPembeli(String nama, String barang, double harga, double diskon) {
        this.nama = nama;
        this.barang = barang;
        this.harga = harga;
        this.diskon = diskon;
    }

    /** @return nama pembeli */
    public String getNama() { return nama; }

    /** @param nama nama pembeli */
    public void setNama(String nama) { this.nama = nama; }

    /** @return nama barang */
    public String getBarang() { return barang; }

    /** @param barang nama barang yang dibeli */
    public void setBarang(String barang) { this.barang = barang; }

    /** @return harga barang */
    public double getHarga() { return harga; }

    /** @param harga harga barang */
    public void setHarga(double harga) { this.harga = harga; }

    /** @return nilai diskon dalam bentuk desimal */
    public double getDiskon() { return diskon; }

    /** @param diskon persentase diskon (0 - 1) */
    public void setDiskon(double diskon) { this.diskon = diskon; }

    /**
     * Menghitung total pembayaran setelah dikurangi diskon.
     *
     * @return total harga yang harus dibayar
     */
    public double hitungTotalBayar() {
        return harga - (harga * diskon);
    }

    /**
     * Menampilkan struk pembelian ke layar.
     * Berisi nama pembeli, barang, harga, diskon, dan total bayar.
     */
    public void cetakStruk() {
        System.out.println("=== Struk Pembelian ===");
        System.out.println("Nama Pembeli : " + getNama());
        System.out.println("Barang       : " + getBarang());
        System.out.println("Harga        : " + getHarga());
        System.out.println("Diskon       : " + (getDiskon() * 100) + "%");
        System.out.println("Total Bayar  : " + hitungTotalBayar());
    }

    /**
     * Menampilkan pesan ucapan terima kasih setelah pembelian selesai.
     */
    public void pesanTerimaKasih() {
        System.out.println("Terima kasih telah berbelanja!");
    }
}
