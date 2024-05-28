import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private int registrationNumber;
    private String name;
    private double salaryPerMonth;
    private List<Invoice> invoices;

    public Employee(int registrationNumber, String name, double salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new ArrayList<>();
        for (Invoice invoice : invoices) {
            this.invoices.add(invoice);
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public abstract double calculateNetSalary();

    public static void printEmployeeInfo(Employee employee) {
        System.out.println("No. Registrasi: " + employee.getRegistrationNumber());
        System.out.println("Nama: " + employee.getName());
        System.out.println("Gaji per Bulan: Rp. " + employee.getSalaryPerMonth());
    }
}