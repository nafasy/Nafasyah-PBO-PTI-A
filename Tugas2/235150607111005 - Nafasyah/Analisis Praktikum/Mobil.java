
public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    private void rubahKecepatan(int i){
        kecepatan = (i*1000)/3600;
    }
    public void setKecepatan(int i){
        rubahKecepatan(i);
    }
    private void rubahSekon(double jam){
        waktu = jam*3600;
    }
    public void setWaktu(double jam){
        rubahSekon(jam);
    }
    public double hitungJarak(){
        return kecepatan*waktu;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+ manufaktur);
        System.out.println("mempunyai nomor plat "+ noPlat);
        System.out.println("serta memililki warna "+ warna);
        System.out.println("mampu menempuh kecepatan "+ kecepatan + "m/s");
        System.out.println("dan menempuh waktu selama " + waktu + " sekon.");
        System.out.println("Sehingga mobil anda menempuh jarak sepanjang " + hitungJarak()/1000 + " kilometer");
    }
}
    
    
    
    
    
    
    
        
