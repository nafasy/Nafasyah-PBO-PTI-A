public class Persik extends Tanaman implements Perawatan{

    public Persik(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah){
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
        masaHidup = 10;
        berbuah = 250;
        perkembangan = 15;
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
        setProsesBerbuah(getProsesBerbuah() + (int)(getProsesBerbuah() * 0.025));
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

