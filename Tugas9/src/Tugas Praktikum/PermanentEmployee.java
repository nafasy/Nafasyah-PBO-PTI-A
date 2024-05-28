public class PermanentEmployee extends Employee {
    private String department;

    public PermanentEmployee(int registrationNumber, String name, double salaryPerMonth, Invoice[] invoices, String department) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public double calculateNetSalary() {
        return getPayableAmount();
    }
}