import java.time.LocalDate;
public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getBonus() {
        return super.getBonus() + 0.10 * getGaji(); // Tambahan 10% dari gaji sebagai tunjangan
    }

    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}