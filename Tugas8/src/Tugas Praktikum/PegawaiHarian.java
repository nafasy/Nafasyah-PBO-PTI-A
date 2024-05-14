class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJamKerja;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJamKerja) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJamKerja = totalJamKerja;
    }

    @Override
    public double hitungGaji() {
        if (totalJamKerja <= 40) {
            return upahPerJam * totalJamKerja;
        } else {
            return (40 * upahPerJam) + ((totalJamKerja - 40) * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString() {
        String x = nama;
        System.out.print("Pegawai Harian: " + x);
        return super.toString() + "\nUpah/jam: "+ upahPerJam +"\nTotal Jam Kerja: " + totalJamKerja + "\nPendapatan: " + hitungGaji();
    }
}