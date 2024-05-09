package src.TugasPraktikum;
import java.util.Scanner;
    
public class TokoKue {
    private static Kue[] kueArray = new Kue[20];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Mengisi array dengan objek KuePesanan dan KueJadi
        for (int i = 0; i < 10; i++) {
            kueArray[i] = new KuePesanan("KuePesanan" + (i + 1), 10.0 + i, 0.5 + i);
        }
        for (int i = 10; i < 20; i++) {
            kueArray[i] = new KueJadi("KueJadi" + (i + 1), 20.0 + i, 1 + i);
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua kue dan jenisnya");
            System.out.println("2. Hitung total harga dari semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi (1-7): ");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanSemuaKue();
                    break;
                case 2:
                    hitungTotalHarga();
                    break;
                case 3:
                    hitungTotalKuePesanan();
                    break;
                case 4:
                    hitungTotalKueJadi();
                    break;
                case 5:
                    tampilkanKueDenganHargaTerbesar();
                    break;
                case 6:
                    hitungTotalKueBasi();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan program kami.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static void tampilkanSemuaKue() {
        for (Kue kue : kueArray) {
            System.out.println(kue);
        }
    }

    private static void hitungTotalHarga() {
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total Harga dari Semua Jenis Kue: " + totalHarga);
    }

    private static void hitungTotalKuePesanan() {
        double totalHarga = 0;
        double totalBerat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHarga += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHarga);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat);
    }

    private static void hitungTotalKueJadi() {
        double totalHarga = 0;
        double totalJumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHarga += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHarga);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);
    }

    private static void tampilkanKueDenganHargaTerbesar() {
        Kue kueDenganHargaTerbesar = kueArray[0];
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > kueDenganHargaTerbesar.hitungHarga()) {
                kueDenganHargaTerbesar = kue;
            }
        }
        System.out.println("Kue dengan Harga Terbesar: " + kueDenganHargaTerbesar);
    }

    private static void hitungTotalKueBasi() {
        double totalHarga = 0;
        int totalLamaHari = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueBasi) {
                totalHarga += kue.hitungHarga();
                totalLamaHari += ((KueBasi) kue).getLamaHari();
            }
        }
        System.out.println("Total Harga Kue Basi: " + totalHarga);
        System.out.println("Total Lama Hari Kue Basi: " + totalLamaHari);
    }
}
