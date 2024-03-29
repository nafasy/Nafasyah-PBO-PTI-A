public class Pesawat {
    public String noPesawat;
    public String maskapai;

    public Pesawat() {
        this.noPesawat = "DEFAULT";
        this.maskapai = "DEFAULT";
    }

    public Pesawat(String noPesawat, String maskapai) {
        this.noPesawat = noPesawat;
        this.maskapai = maskapai;
    }

    public Pesawat(String noPesawat) {
        this.noPesawat = noPesawat;
        this.maskapai = "DEFAULT";
    }

    public void terbang(String waktu) {
        System.out.println("Pesawat " + this.maskapai + " akan terbang pada " + waktu);
    }

    public void terbang(String waktu, String tujuan) {
        System.out.println("Pesawat " + this.maskapai + " akan terbang pada " + waktu + " menuju " + tujuan);
    }

    public void terbang(String waktu, String tujuan, int penumpang) {
        System.out.println("Pesawat " + this.maskapai + " akan terbang pada " + waktu + " menuju " + tujuan + " dengan " + penumpang + " penumpang");
    }

    public void terbang(String waktu, String tujuan, String kondisiCuaca) {
        System.out.println("Pesawat " + this.maskapai + " akan terbang pada " + waktu + " menuju " + tujuan + " dengan kondisi cuaca " + kondisiCuaca);
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

    public Pesawat upgradePesawat() {
        Pesawat pesawatBaru = new Pesawat();
        pesawatBaru.noPesawat = this.noPesawat + "_UPGRADED";
        pesawatBaru.maskapai = this.maskapai + "_UPGRADED";
        return pesawatBaru;
    }

}