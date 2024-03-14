public class BukuTulis {
    private int jumlahLembar = 50;
    private int kataPerLembar = 400;
    private int sanggupNulis = 100;

    public static void main(String[] args) {
        BukuTulis buku = new BukuTulis();
        int waktu = buku.HitungWaktu();
        System.out.println("Waktu yang diperlukan untuk menyelesaikan 1 buku adalah " + waktu+ " hari.");
    }

    public int HitungWaktu() {
        int perluWaktu = (kataPerLembar*jumlahLembar)/sanggupNulis;
        return perluWaktu;
    }
}
