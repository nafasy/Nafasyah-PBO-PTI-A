import java.util.Scanner;

public class Transaksi {
    private Customer[] customers;
    private int banyakCust;

    public Transaksi(int kapasitas) {
        customers = new Customer[kapasitas];
        banyakCust = 0;
    }

    public void tambahCust(Customer customer) {
        if (banyakCust < customers.length) {
            customers[banyakCust] = customer;
            banyakCust++;
        } else {
            System.out.println("Database pelanggan sudah penuh.");
        }
    }

    public Customer findCustomer(String noPengguna) {
        for (Customer customer : customers) {
            if (customer != null && customer.getNoPengguna().equals(noPengguna)) {
                return customer;
            }
        }
        return null;
    }

    public boolean autentikasiCustomer(String noPengguna, int pin) {
        Customer customer = findCustomer(noPengguna);
        if (customer != null) {
            return customer.autentikasi(pin);
        }
        return false;
    }

    public boolean buatPembelian(String noPengguna, double jumlah) {
        Customer customer = findCustomer(noPengguna);
        if (customer != null) {
            double saldoAwal = customer.getSaldo();
            if (customer.pembelian(jumlah)) {
                if (noPengguna.substring(0, 2).equals("38") ) {
                    if (jumlah > 1000000) {
                        customer.topUp(jumlah * 0.05);
                    }
                } else if (noPengguna.substring(0, 2).equals("56")) {
                    if (jumlah > 1000000) {
                        customer.topUp(jumlah * 0.07);
                    } else {
                        customer.topUp(jumlah * 0.02);
                    }
                } else if (noPengguna.substring(0, 2).equals("74")) {
                    if (jumlah > 1000000) {
                        customer.topUp(jumlah * 0.10);
                    } else {
                        customer.topUp(jumlah * 0.05);
                    }
                }
                System.out.println("Transaksi berhasil. Saldo awal: " + saldoAwal + ", Saldo akhir: " + customer.getSaldo());
                return true;
            } else {
                System.out.println("Transaksi gagal: Saldo tidak mencukupi.");
            }
        }
        return false;
    }

    public static void tambahCust(Transaksi transaksi, Scanner input) {
        while (true) {
            System.out.print("Masukkan nama pelanggan (Ketik 'selesai' untuk selesai): ");
            String nama = input.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan saldo pelanggan: ");
            int saldo = Integer.parseInt(input.nextLine());

            System.out.print("Masukkan nomor pengguna (10 digit): ");
            String noPengguna = input.nextLine();

            System.out.print("Masukkan PIN (4 digit): ");
            int pin = Integer.parseInt(input.nextLine());

            Customer customer = new Customer(nama, saldo, noPengguna, pin);
            transaksi.tambahCust(customer);
        }
    }

    public void topUp(String noPengguna, int jumlah) {
        Customer customer = findCustomer(noPengguna);
        if (customer != null) {
            double saldoAwal = customer.getSaldo();
            customer.topUp(jumlah);
            System.out.println("Top-up berhasil. Saldo awal: " + saldoAwal + ", Saldo akhir: " + customer.getSaldo());
        } else {
            System.out.println("Top-up gagal: Nomor pengguna tidak valid.");
        }
    }
    
    public static void lakukanTransaksi(Transaksi transaksi, Scanner input) {
        System.out.print("Masukkan nomor pengguna: ");
        String noPengguna = input.nextLine();

        System.out.print("Masukkan PIN: ");
        int pin = Integer.parseInt(input.nextLine());

        if (transaksi.autentikasiCustomer(noPengguna, pin)) {
            System.out.println("Apakah Anda ingin melakukan pembelian (P) atau top-up (T)?");
            String jenisTransaksi = input.nextLine();

            if (jenisTransaksi.equalsIgnoreCase("P")) {
                System.out.print("Masukkan jumlah pembelian: ");
                double jumlah = Double.parseDouble(input.nextLine());

                transaksi.buatPembelian(noPengguna, jumlah);
            } else if (jenisTransaksi.equalsIgnoreCase("T")) {
                System.out.print("Masukkan jumlah top-up: ");
                int jumlah = Integer.parseInt(input.nextLine());

                transaksi.topUp(noPengguna, jumlah);
            } else {
                System.out.println("Jenis transaksi tidak valid.");
            }
        } else {
            System.out.println("Autentikasi pelanggan gagal.");
        }
    }
}
