public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Mouse", 2, 15200);
        Invoice invoice2 = new Invoice("Keyboard", 1, 30000);
        Invoice[] invoices = {invoice1, invoice2};

        PermanentEmployee permanentEmployee = new PermanentEmployee(123456, "Nafaaa", 2000000, invoices, "IT");

        System.out.println("Informasi Karyawan Tetap:");
        Employee.printEmployeeInfo(permanentEmployee);

        System.out.println("\nDetail Belanja Karyawan:");
        for (Invoice invoice : permanentEmployee.getInvoices()) {
            System.out.println("Nama Produk: " + invoice.getProductName());
            System.out.println("Jumlah: " + invoice.getQuantity());
            System.out.println("Harga per item: Rp. " + invoice.getPricePerItem());
            System.out.println("Harga Total: Rp." + invoice.getPayableAmount());
            System.out.println();
        }

        System.out.println("Gaji Bersih setelah Dikurangi Jumlah Invoice: Rp." + permanentEmployee.calculateNetSalary());

        InternEmployee internEmployee = new InternEmployee(789012, "Lisa", 1000000, invoices, 6);

        System.out.println("\nInformasi Karyawan Magang:");
        Employee.printEmployeeInfo(internEmployee);

        System.out.println("\nDetail Belanja Karyawan:");
        for (Invoice invoice : internEmployee.getInvoices()) {
            System.out.println("Nama Produk: " + invoice.getProductName());
            System.out.println("Jumlah: " + invoice.getQuantity());
            System.out.println("Harga per item: Rp. " + invoice.getPricePerItem());
            System.out.println("Harga Total: Rp. " + invoice.getPayableAmount());
            System.out.println();
        }

        System.out.println("Gaji Bersih setelah Dikurangi Jumlah Invoice: Rp. " + internEmployee.calculateNetSalary());

        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
    }
}