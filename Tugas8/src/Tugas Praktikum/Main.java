
public class Main {
    public static void main(String[] args) {
        // Membuat objek PegawaiTetap
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Nafasyah Rizky", "12345678", 5000000);
        // Membuat objek PegawaiHarian
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Amaliyah Syahidatun", "45678901", 20000, 45);
        // Membuat objek Sales
        Sales sales1 = new Sales("Ruby Jane", "23456789", 30000000, 0.1);

        // Polimorfisme: Upcasting
        Pegawai[] pegawai = { pegawaiTetap1, pegawaiHarian1, sales1 };

        // Menampilkan semua pegawai
        for (Pegawai p : pegawai) {
            System.out.println(p);
            System.out.println("--------------------------------");
        }
        // Upcasting
        Pegawai ptUp = (Pegawai) pegawaiTetap1;
        ptUp.toString();
        System.out.println("");
        Pegawai phUp = (Pegawai) pegawaiHarian1;
        phUp.toString();
        System.out.println("");
        Pegawai s = (Pegawai) sales1;
        s.toString();
        System.out.println("");

        // Downcasting
        PegawaiTetap pt = (PegawaiTetap) pegawaiTetap1;
        pt.toString();
        System.out.println("");
        PegawaiHarian ph = (PegawaiHarian) pegawaiHarian1;
        ph.toString();
        System.out.println("");
        Sales s1 = (Sales) sales1;
        s1.toString();
        System.out.println("");
    }
}
