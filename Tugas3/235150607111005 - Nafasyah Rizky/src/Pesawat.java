package src;

public class Pesawat {
    public String noPesawat;
    public String maskapai;

    public void terbang(String waktu){
        System.out.println("Pesawat " + this.maskapai + " akan terbang pada " + waktu);
    }
    public void tundaTerbang(String waktuBaru){
        System.out.println("Pemberangkatan Pesawat " + this.maskapai + " tertunda. Penerbangan terbaru akan dilakukan pada " + waktuBaru);
    }
    public void mintaPendaratan(boolean darurat){
        if (darurat) {
            System.out.println("Pesawat " + this.maskapai + " akan segera melakukan pendaratan.");
            
        }else {
            System.out.println("Pesawat aman jaya luar biasa.");
        }

    }

}
