public class Manusia {
    private String nama;
    private boolean jenisKelamin; //true = laki, false = cewe
    private String nik;
    private boolean menikaah;
    
   public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikaah) {
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.nik = nik;
    this.menikaah = menikaah;
}
 public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public boolean isJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public boolean isMenikaah() {
        return menikaah;
    }
    public void setMenikaah(boolean menikaah) {
        this.menikaah = menikaah;
    }

    public double getTunjangan(){
        if (menikaah) {
            return (jenisKelamin) ? 25 : 20;
        }
        else {
            return 15;
        } 
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + gender + "\nJumlah Pendapatan: " + getPendapatan();
    }
}
