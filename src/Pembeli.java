public class Pembeli {
    private String nama;
    private String barang;
    private double harga;
    private double diskon;

    // 2. Introduce Constructor untuk inisialisasi data langsung
    public Pembeli(String nama, String barang, double harga, double diskon) {
        this.nama = nama;
        this.barang = barang;
        this.harga = harga;
        this.diskon = diskon;
    }

    // Getter & Setter (hasil dari Encapsulate Field)
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getBarang() { return barang; }
    public void setBarang(String barang) { this.barang = barang; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public double getDiskon() { return diskon; }
    public void setDiskon(double diskon) { this.diskon = diskon; }

    // 3. Extract Method - hitung total pembayaran
    public double hitungTotalBayar() {
        return harga - (harga * diskon);
    }

    // 4. Extract Method - cetak struk pembelian
    public void cetakStruk() {
        System.out.println("=== Struk Pembelian ===");
        System.out.println("Nama Pembeli : " + getNama());
        System.out.println("Barang       : " + getBarang());
        System.out.println("Harga        : " + getHarga());
        System.out.println("Diskon       : " + (getDiskon() * 100) + "%");
        System.out.println("Total Bayar  : " + hitungTotalBayar());
    }

    // 5. Rename Method - ubah nama cetakNota() menjadi pesanTerimaKasih()
    public void pesanTerimaKasih() {
        System.out.println("Terima kasih telah berbelanja!");
    }
}