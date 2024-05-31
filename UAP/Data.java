import java.util.*;

public class Data{
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in =  new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masukkan masa tanam (dalam bulan): ");
        int masaTanamBulan = in.nextInt();
        int masaTanamHari = masaTanamBulan*30;

        System.out.println("Menanam 3 tanaman di awal:");
        for (int i = 0; i < 3; i++) {
            menanam();
        }

        for (int hari = 1; hari <= masaTanamHari; hari++) {
            for (int i = 0; i < tanamans.size(); i++) {
                Tanaman tanaman = tanamans.get(i);

                if (lokasi.contains(i)) {
                    continue;
                }

                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                } else {
                    lokasi.add(i);
                    menanam();
                }
            }

            if (hari % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        Perawatan p = (Perawatan)tanamans.get(i);
                        p.treatment();
                    }
                }
            }
        }
        info();
    }

    public static void menanam() {
        System.out.println("Pilih tanaman yang ingin ditanam:");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");

        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                tanamans.add(new Tomat(90, 3, 15, 15, 15, 15));
                System.out.println("Tomat berhasil ditanam.");
                break;
            case 2:
                tanamans.add(new Stroberi(90, 3, 15, 15, 15, 15));
                System.out.println("Stroberi berhasil ditanam.");
                break;
            case 3:
                tanamans.add(new Persik(90, 3, 15, 15, 15, 15));
                System.out.println("Persik berhasil ditanam.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                menanam();
        }
    }

    public static void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman ke-" + (i + 1) + ":");
            System.out.println(tanamans.get(i).toString());
            System.out.println();
        }
    }

}