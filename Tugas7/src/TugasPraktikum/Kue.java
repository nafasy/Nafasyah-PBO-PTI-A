package src.TugasPraktikum;

public abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Jenis Kue: " + nama + ", Harga: " + hitungHarga();
    }
}
