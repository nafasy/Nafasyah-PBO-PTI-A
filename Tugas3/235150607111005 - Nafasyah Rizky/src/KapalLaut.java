package src;
public class KapalLaut {
    public String noKapal;
    public String manufaktur;

    public void berlayar(String tujuan){
        System.out.println("Kapal " + this.manufaktur + " akan berlayar di " + tujuan);
    }

    public void periksaKondisi(){
        
    }
    public void tambahPenumpang(int jumlah){
        System.out.println("Kapal " + this.manufaktur + " menambah " + jumlah + " penumpang.");
    }
}
