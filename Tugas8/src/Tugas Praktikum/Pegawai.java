package src;

abstract class Pegawai {
    protected String nama;
    protected String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public abstract double hitungGaji();

    @Override
    public String toString() {
        return "\nNo. KTP: " + noKTP;
    }
}
