import java.util.*;

public class MainAnalisis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Manusia nafa = new Manusia( "Nafasyah Rizky Anandita", 19);

        Manusia manusia = new Manusia("null", 0);
        manusia.informasi();

        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        manusia.berjalan();
        manusia.bersuara();
        manusia.makan();

        System.out.println("");
        Hewan hewan = new Hewan("", 0);

        hewan.informasi();

        hewan.tampilkanNama();
        hewan.tampilkanUmur();

        hewan.berjalan();
        hewan.bersuara();
        hewan.makan();
    }
    
}
