public class PieceWorker extends Employee{
    private double wagePerPiece; // upah per barang
    private int quantityProduced; // jumlah barang yang diproduksi

    public PieceWorker(String name, String noKTP, String tanggalLahir, double wagePerPiece, int quantityProduced) {
        super(name, noKTP, tanggalLahir);       
        setWagePerPiece(wagePerPiece);
        setQuantityProduced(quantityProduced);
    }

    public void setWagePerPiece(double wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setQuantityProduced(int quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public int getQuantityProduced() {
        return quantityProduced;
    }

    public double earnings() {
        return getWagePerPiece() * getQuantityProduced();
    }

    public String toString() {
        return String.format("PieceWorker: " + super.toString() + "\nTanggal lahir: " + getTanggalLahir() + "\nWage per piece: " + getWagePerPiece() + "\nQuantity produced: " + getQuantityProduced());
    }
}
