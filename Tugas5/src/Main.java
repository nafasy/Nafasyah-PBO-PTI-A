import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di Swalayan Nafa");
        System.out.println("Silakan tambahkan pelanggan:");

        Transaksi transaksi = new Transaksi(10); 

        transaksi.tambahCust(transaksi, input);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nSilakan pilih transaksi:");
            transaksi.lakukanTransaksi(transaksi, input);

            System.out.println("\nApakah Anda ingin melakukan transaksi lagi? (ya/tidak)");
            String pilihan = input.nextLine();
            if (!pilihan.equalsIgnoreCase("ya")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah berbelanja di Swalayan Nafa.");
    }
}
        // yang dicomment ini merupakan bentuk kodingan sebelum menjadi program interaktif
        // Menambahkan pelanggan
        // Customer customer1 = new Customer("Nafasyah", 1500000, "3889345678", 1234);
        // Customer customer2 = new Customer("Nawfal", 2000000, "5645895645", 5678);
        // Customer customer3 = new Customer("Farel", 1200000, "7412565623", 1414);

        // transaksi.tambahCust(customer1);
        // transaksi.tambahCust(customer2);
        // transaksi.tambahCust(customer3);

//         if (transaksi.autentikasiCustomer("3889345678", 1234)) {
//             System.out.println("Pelanggan berhasil diautentikasi.");
//             if (transaksi.buatPembelian("3889345678", 1200000)) { // Contoh pembelian 1.2 juta
//                 System.out.println("Pembelian berhasil dilakukan.");
//             } else {
//                 System.out.println("Pembelian gagal dilakukan.");
//             }
//         } else {
//             System.out.println("Autentikasi pelanggan gagal.");
//         }

