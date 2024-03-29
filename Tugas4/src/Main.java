public class Main {
    public static void main(String[] args) {

        Pesawat pesawat1 = new Pesawat();
        Pesawat pesawat2 = new Pesawat("ABC123", "Garuda Indonesia");
        Pesawat pesawat3 = new Pesawat("XYZ789");

        pesawat2.terbang("08.00");
        pesawat2.terbang("08.00", "Jakarta");
        pesawat2.terbang("08.00", "Jakarta", 150);
        pesawat2.terbang("08.00", "Jakarta", "cerah");
    }
}