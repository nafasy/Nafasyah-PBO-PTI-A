import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunKerja >= 0 && tahunKerja <= 5) {
            return 0.05 * gaji; 
        } else if (tahunKerja > 5 && tahunKerja <= 10) {
            return 0.10 * gaji; 
        } else {
            return 0.15 * gaji; 
        }
    }

    public double getGajiTotal() {
        double gajiTotal = gaji + getBonus();
        if (jumlahAnak > 0) {
            gajiTotal += 20 * jumlahAnak; 
        }
        return gajiTotal;
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + getGajiTotal();
    }
}