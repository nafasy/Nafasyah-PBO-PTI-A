package src;

class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    @Override
    public double hitungGaji() {
        return upah;
    }

    @Override
    public String toString() {
        String x = nama;
        System.out.print("Pegawai Tetap: " + x);
        return super.toString() + "Upah: "+ upah + "\nPendapatan: " + hitungGaji();
    }
}
