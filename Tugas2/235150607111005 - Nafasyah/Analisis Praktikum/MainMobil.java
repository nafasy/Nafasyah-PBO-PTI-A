import java.util.*;


public class MainMobil {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    //instan objek bernama m1 
        Mobil m1 = new Mobil(); 
        System.out.print("Masukkan kecepatan mobil 1: ");
        int kecepatanMobil = input.nextInt(); input.nextLine();
        System.out.print("Masukkan manufaktur mobil 1: ");
        String manufakturMobil = input.nextLine();
        System.out.print("Masukkan no. plat mobil 1: ");
        String noPlatMobil = input.nextLine();
        System.out.print("Masukkan warna mobil 1: ");
        String warnaMobil = input.nextLine();
        System.out.print("Masukkan waktu tempuh mobil 1 dalam satuan jam: ");
        double waktuTempuh = input.nextDouble(); 
        System.out.println("================");

        m1.setKecepatan(kecepatanMobil); 
        m1.setManufaktur(manufakturMobil); 
        m1.setNoPlat(noPlatMobil); 
        m1.setWarna(warnaMobil); 
        m1.setWaktu(waktuTempuh);
        m1.displayMessage();
        System.out.println("================");

    //instan objek baru bernama m2 
        Mobil m2 = new Mobil(); 
        System.out.print("Masukkan kecepatan mobil 2: ");
        int kecepatanMobil2 = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan manufaktur mobil 2: ");
        String manufakturMobil2 = input.nextLine();
        System.out.print("Masukkan no. plat mobil 2: ");
        String noPlatMobil2 = input.nextLine();
        System.out.print("Masukkan wanra mobil 2: ");
        String warnaMobil2 = input.nextLine();
        System.out.println("================");

        m2.setKecepatan(kecepatanMobil2); 
        m2.setManufaktur(manufakturMobil2); 
        m2.setNoPlat(noPlatMobil2); 
        m2.setWarna(warnaMobil2); 
        m2.displayMessage();
        System.out.println("================");
    //merubah warna dari objek m1

        System.out.println("Ingin merubah warna mobil 1 menjadi warna apa? ");
        String warnaBerubah = input.nextLine();
        System.out.println("mobil pada objek m1 di rubah menjadi warna " + warnaBerubah);
        m1.setWarna(warnaBerubah);
        //menampilkan hasil perubahan 
        m1.displayMessage();
       
    }
}    

