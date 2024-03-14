import java.util.Scanner;

class Buku {
    String judul;
    String penulis;
    String kategori;

    public Buku(String judul, String penulis, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }
}

class Perpustakaan {
    Buku[] koleksiBuku;
    int jumlahBuku;

    public Perpustakaan(int maxSize) {
        koleksiBuku = new Buku[maxSize];
        jumlahBuku = 0;
    }

    public void tambahBuku(String judul, String penulis, String kategori) {
        Buku buku = new Buku(judul, penulis, kategori);
        koleksiBuku[jumlahBuku] = buku;
        jumlahBuku++;
    }

    public void tampilkanBuku() {
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Judul: " + koleksiBuku[i].judul);
            System.out.println("Penulis: " + koleksiBuku[i].penulis);
            System.out.println("Kategori: " + koleksiBuku[i].kategori);
            System.out.println();
        }
    }

    public void tampilkanBukuBerdasarkanKategori(String kategori) {
        boolean ketemu = false;
        for (int i = 0; i < jumlahBuku; i++) {
            if (koleksiBuku[i].kategori.equalsIgnoreCase(kategori)) {
                System.out.println("Judul: " + koleksiBuku[i].judul);
                System.out.println("Penulis: " + koleksiBuku[i].penulis);
                System.out.println("Kategori: " + koleksiBuku[i].kategori);
                System.out.println();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Tidak ada buku dalam kategori '" + kategori + "'.");
        }
    }
}

public class PerpustakaanNafa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan(100);

        perpustakaan.tambahBuku("Bumi Manusia", "Pramoedya Ananta Toer", "Fiksi");
        perpustakaan.tambahBuku("Negeri 5 Menara", "Ahmad Fuadi", "Fiksi");
        perpustakaan.tambahBuku("Bidadari yang Mengembara", "A.S. Laksana", "Fiksi");
        perpustakaan.tambahBuku("Koala Kumal", "Raditya Dika", "Fiksi");
        perpustakaan.tambahBuku("The Innovators", "Walter Isaacson", "Teknologi");
        perpustakaan.tambahBuku("Elon Musk", "Ashlee Vance", "Teknologi");
        perpustakaan.tambahBuku("The Second Machine Age", " Erik Brynjolfsson dan Andrew McAfee", "Teknologi");
        perpustakaan.tambahBuku("Algorithms to Live By", "Brian Christian dan Tom Griffiths", "Teknologi");
        perpustakaan.tambahBuku("Life 3.0", "Max Tegmark", "Teknologi");
        perpustakaan.tambahBuku("Filsafat Ilmu", "A. Fathurrohman", "Filsafat");
        perpustakaan.tambahBuku("Filsafat Manusia", "Djoko Setiadi", "Filsafat");
        perpustakaan.tambahBuku("Panduan Ringkas Filsafat", "W.S. Wibisono", "Filsafat");
        perpustakaan.tambahBuku("Filsafat Hidup", "Chaerul Umam", "Filsafat");
        perpustakaan.tambahBuku("Filsafat Cinta", "Donny Gahral Adian", "Filsafat");
        perpustakaan.tambahBuku("Sejarah Indonesia Modern 1200-2008", "M.C. Ricklefs", "Sejarah");
        perpustakaan.tambahBuku("Indonesia", "Merle Calvin Ricklefs", "Sejarah");
        perpustakaan.tambahBuku("Sejarah Nasional Indonesia Jilid 1-5", "LIPI", "Sejarah");
        perpustakaan.tambahBuku("Sejarah Dunia Modern 1500-1900", "R.M. Anwar", "Sejarah");
        perpustakaan.tambahBuku("Sejarah Peradaban Manusia", "Peter N. Stearns", "Sejarah");
        perpustakaan.tambahBuku("Ensiklopedi Agama", "M. Zafrullah", "Agama");
        perpustakaan.tambahBuku("Pengantar Studi Agama", "Imam Mudzakkir", "Agama");
        perpustakaan.tambahBuku("Filsafat Agama", "Djoko Setiadi", "Agama");
        perpustakaan.tambahBuku("Tuhan, Agama, dan Spiritualitas dalam Perspektif Sosial", "Azyumardi Azra", "Agama");
        perpustakaan.tambahBuku("Kristologi", "S. Setiawan W. Yogyarto", "Agama");
        perpustakaan.tambahBuku("Psikologi Kepribadian", "Alwisol", "Psikologi");
        perpustakaan.tambahBuku("Psikologi Sosial", "Ruth Natalia Made Puspasari", "Psikologi");
        perpustakaan.tambahBuku("Psikologi Anak", "Hurlock", "Psikologi");
        perpustakaan.tambahBuku("Psikologi Abnormal", "Sarlito Wirawan Sarwono", "Psikologi");
        perpustakaan.tambahBuku("Psikologi Pendidikan", "John W. Santrock", "Psikologi");
        perpustakaan.tambahBuku("Teori Politik Modern", "Horacio S. Arganis", "Politik");
        perpustakaan.tambahBuku("Politik Indonesia", "Miriam Budiardjo", "Politik");
        perpustakaan.tambahBuku("Politik dan Pemilu di Indonesia", "Edward Aspinall", "Politik");
        perpustakaan.tambahBuku("Politik Hukum", "Jimly Asshiddiqie", "Politik");
        perpustakaan.tambahBuku("Partai Politik", "Miriam Budiardjo", "Politik");

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Tampilkan Buku Berdasarkan Kategori");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = input.nextLine();
                    System.out.print("Kategori: ");
                    String kategori = input.nextLine();
                    perpustakaan.tambahBuku(judul, penulis, kategori);
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    perpustakaan.tampilkanBuku();
                    break;
                case 3:
                    System.out.print("Kategori: ");
                    String kategoriInput = input.nextLine();
                    System.out.println("Buku dalam kategori '" + kategoriInput + "':");
                    perpustakaan.tampilkanBukuBerdasarkanKategori(kategoriInput);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);
    }
}
