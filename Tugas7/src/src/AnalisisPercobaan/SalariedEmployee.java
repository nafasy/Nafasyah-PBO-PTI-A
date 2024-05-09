public class SalariedEmployee extends Employee {
    private double weeklySalary; // gaji/minggu

    public SalariedEmployee(String name, String noKTP, String tanggalLahir, double salary) {
        super(name, noKTP, tanggalLahir);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;

    }

    public double earnings() {
        return getWeeklySalary() * 4;
    }

    public String toString() {
        return String.format("Salaried	employee:	" + super.toString() + "\nTanggal lahir: " + getTanggalLahir() + "\nweekly salary:" + getWeeklySalary());
    }
}
