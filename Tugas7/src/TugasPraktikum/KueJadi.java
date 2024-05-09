package src.TugasPraktikum;

class KueJadi extends Kue {
    private double jumlah;
    
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }
}
