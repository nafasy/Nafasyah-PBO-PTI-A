import java.util.*;
public class Customer {
    Scanner input = new Scanner (System.in);
    private String nama;
    private int saldo;
    private String noPengguna;
    private int pin;
    private int nyobaBrapaKali;

    public Customer(String nama, int saldo, String noPengguna, int pin) {
        this.nama = nama;
        this.saldo = saldo;
        this.noPengguna = noPengguna;
        this.pin = pin;
        this.nyobaBrapaKali = 0;
    }

    public String getNoPengguna() {
        return noPengguna;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autentikasi(int inputPin) {
        int maksPercobaan = 3;
        int percobaan = 0;
        while (percobaan < maksPercobaan) {
            if (inputPin == pin) {
                nyobaBrapaKali = 0;
                return true;
            } else {
                nyobaBrapaKali++;
                percobaan++;
                if (nyobaBrapaKali >= 3) {
                    System.out.println("Autentikasi gagal: Batas percobaan autentikasi melebihi batas.");
                    return false;
                }
                System.out.println("Autentikasi gagal. Masukkan PIN lagi:");
                inputPin = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Batas percobaan autentikasi melebihi batas.");
        return false;
    }

    public boolean pembelian(double jumlah) {
        if (saldo - jumlah >= 10000) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
    }
}    
