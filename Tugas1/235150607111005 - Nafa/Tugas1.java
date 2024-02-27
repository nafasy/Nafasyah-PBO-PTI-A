import java.util.ArrayList;
import java.util.Scanner;

public class Tugas1 {
    public static ArrayList<String> namaPengguna = new ArrayList<>();
    public static ArrayList<String> kataSandi = new ArrayList<>();
    public static ArrayList<String> penggunaHadir = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Daftar");
            System.out.println("2. Masuk");
            System.out.println("3. Presensi Online");
            System.out.println("4. Lihat Presensi");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    daftar();
                    break;
                case 2:
                    masuk();
                    break;
                case 3:
                    tandaiPresensi();
                    break;
                case 4:
                    lihatPresensi();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }

   public static void daftar() {
        System.out.print("Masukkan nama pengguna: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String sandi = scanner.nextLine();
        namaPengguna.add(nama);
        kataSandi.add(sandi);
        System.out.println("Pengguna berhasil didaftarkan.");
    }

    public static void masuk() {
        System.out.print("Masukkan nama pengguna: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String sandi = scanner.nextLine();

        for (int i = 0; i < namaPengguna.size(); i++) {
            if (namaPengguna.get(i).equals(nama) && kataSandi.get(i).equals(sandi)) {
                System.out.println("Masuk berhasil.");
                return;
            }
        }
        System.out.println("Nama pengguna atau kata sandi salah.");
    }

    public static void tandaiPresensi() {
        System.out.print("Masukkan nama pengguna untuk presensi: ");
        String nama = scanner.nextLine();
        if (namaPengguna.contains(nama)) {
            penggunaHadir.add(nama);
            System.out.println("Presensi berhasil ditandai untuk pengguna: " + nama);
        } else {
            System.out.println("Pengguna tidak ditemukan.");
        }
    }

    public static void lihatPresensi() {
        System.out.println("Pengguna yang hadir:");
        for (String pengguna : penggunaHadir) {
            System.out.println("Nama Pengguna: " + pengguna);
        }
    }
}