package src;

public class Main {
    public static void main(String[] args) {
        // Membuat objek PegawaiTetap
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("John Doe", "12345678", 5000000);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Jane Smith", "87654321", 5500000);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Emily Davis", "12348765", 6000000);

        // Membuat objek PegawaiHarian
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Michael Brown", "45678901", 20000, 45);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Sarah Wilson", "10987654", 22000, 38);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("David Johnson", "54321098", 21000, 50);

        // Membuat objek Sales
        Sales sales1 = new Sales("Alice Green", "23456789", 30000000, 0.1);
        Sales sales2 = new Sales("Robert White", "98765432", 40000000, 0.15);
        Sales sales3 = new Sales("Sophia Blue", "34567890", 25000000, 0.12);

        // Polimorfisme: Upcasting
        Pegawai[] pegawai = {pegawaiTetap1, pegawaiTetap2, pegawaiTetap3, pegawaiHarian1, pegawaiHarian2, pegawaiHarian3, sales1, sales2, sales3};

        // Menampilkan semua pegawai
        for (Pegawai p : pegawai) {
            System.out.println(p);
            System.out.println("--------------------------------");
        }

        // Downcasting
        if (pegawai[0] instanceof PegawaiTetap) {
            PegawaiTetap pt = (PegawaiTetap) pegawai[0];
            System.out.println("Downcasting berhasil: " + pt.getNama() + " adalah Pegawai Tetap");
        }

        if (pegawai[3] instanceof PegawaiHarian) {
            PegawaiHarian ph = (PegawaiHarian) pegawai[3];
            System.out.println("Downcasting berhasil: " + ph.getNama() + " adalah Pegawai Harian");
        }

        if (pegawai[6] instanceof Sales) {
            Sales s = (Sales) pegawai[6];
            System.out.println("Downcasting berhasil: " + s.getNama() + " adalah Sales");
        }
    }
}
