public class InternEmployee extends Employee implements Contract {
    private int durationOfContract;

    public InternEmployee(int registrationNumber, String name, double salaryPerMonth, Invoice[] invoices, int durationOfContract) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.durationOfContract = durationOfContract;
    }

    public int getDurationOfContract() {
        return durationOfContract;
    }

    @Override
    public double calculateNetSalary() {
        return getPayableAmount();
    }

    @Override
    public void attendTrainingSession() {
        System.out.println(getName() + " sedang training.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Durasi kontrak " + getName() + ": "  + durationOfContract + " bulan.");
    }
}
