public class Stroberi extends Tanaman implements Perawatan{

    public Stroberi(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah){
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
        masaHidup = 60;
        berbuah = 150;
        perkembangan = 35;
    }

   
    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + 1);

        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);

            if (getProsesBerbuah() == getBerbuah()) {
                setProsesBerbuah(0);
            } else {
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
        
        }
    }

    @Override
    public void treatment() {
        setProsesBerbuah(getProsesBerbuah() + (int)(getProsesBerbuah() * 0.05));
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
