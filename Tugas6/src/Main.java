import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia lakiLakiMenikah = new Manusia("Joni Fahrudiansyah", true, "1234567890", true);
        Manusia perempuanMenikah = new Manusia("Angelina Jolie", false, "0987654321", true);
        Manusia belumMenikah = new Manusia("Jeong Jaehyun", true, "1357924680", false);

        System.out.println("Data Manusia:");
        System.out.println("Laki-laki telah menikah:\n" + lakiLakiMenikah);
        System.out.println("\nPerempuan telah menikah:\n" + perempuanMenikah);
        System.out.println("\nBelum menikah:\n" + belumMenikah);

        MahasiswaFILKOM mahasiswa = new  MahasiswaFILKOM("Jeno", true, "123456789", false, "165150200111111", 2.8);
        MahasiswaFILKOM mahasiswa2 = new  MahasiswaFILKOM("Karina", false, "987654321", true, "165150200222222", 3.2);
        MahasiswaFILKOM mahasiswa3 = new  MahasiswaFILKOM("Alex", true, "246813579", true, "165150200333333", 3.8);

        System.out.println("\nData Mahasiswa Filkom:");
        System.out.println("IPK < 3:\n" + mahasiswa);
        System.out.println("\nIPK 3 - 3.5:\n" + mahasiswa2);
        System.out.println("\nIPK 3.5 - 4:\n" + mahasiswa3);

        Pekerja pekerja1 = new Pekerja("Jake Smith", true, "123456789", true, 5000, LocalDate.of(2019, 1, 1));
        pekerja1.setJumlahAnak(2);
        Pekerja pekerja2 = new Pekerja("Lia Aulia", false, "987654321", false, 6000, LocalDate.of(2012, 1, 1));
        Pekerja pekerja3 = new Pekerja("Akbar Sadana", true, "246813579", true, 7000, LocalDate.of(2001, 1, 1));
        pekerja3.setJumlahAnak(10);

        System.out.println("\nData Pekerja:");
        System.out.println("Lama bekerja 2 tahun, anak 2:\n" + pekerja1);
        System.out.println("\nLama bekerja 9 tahun:\n" + pekerja2);
        System.out.println("\nLama bekerja 20 tahun, anak 10:\n" + pekerja3);

        Manager manager = new Manager("Joe Taslim", true, "123456789", true, 7500, LocalDate.of(2006, 1, 1), "IT Department");

        System.out.println("\nData Manager:");
        System.out.println("Lama bekerja 15 tahun dengan gaji $7500:\n" + manager);
    }
    
}
