package src;

public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        mbl.manufaktur = "Toyota";
        mbl.noPlat = "N 2716 DR";

        mbl.aturNomorPlat("DR 2192 ABX");

        KapalLaut kapal = new KapalLaut();
        kapal.manufaktur = "Samudera";
        kapal.noKapal = "8814275";

        kapal.berlayar("Malaysia");
        kapal.tambahPenumpang(25);

        Pesawat plane = new Pesawat();
        plane.maskapai = "Garuda Indonesia";
        plane.noPesawat = "GA 168";

        plane.terbang("Sabtu, 2 Maret 2024");
        plane.tundaTerbang("Minggu, 25 Maret 2024");
        plane.mintaPendaratan(false);
        
    }
    
}
