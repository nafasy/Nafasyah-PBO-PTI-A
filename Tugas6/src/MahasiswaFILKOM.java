public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public String getStatus(){
        String prodi = "";
        String angkatan = nim.substring(0, 2);
        char prodiDigit = nim.charAt(6);
        switch (prodiDigit) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi Tidak Dikenal";
        }
        return prodi + ", 20" + angkatan;
    }
    public double getBeasiswa(){
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50;
        }
        else if (ipk >= 3.5 && ipk == 4) {
            return 75;
        }
        else {
            return 0;
        }
    }
    public String toString(){
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus();

    }
}
