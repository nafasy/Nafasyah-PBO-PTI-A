public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;// gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, String tanggalLahir, double sales, double rate, double salary) {
        super(name, noKTP, tanggalLahir, sales, rate);
        setBaseSalary(salary);
        setTanggalLahir(tanggalLahir);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("Base-Salaried	" + super.toString() +  "\nbase salary " + getBaseSalary());
    }
}
