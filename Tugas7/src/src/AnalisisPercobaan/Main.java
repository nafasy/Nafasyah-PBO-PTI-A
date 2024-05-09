public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", "25 April 2005", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", "5 April 2005", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", "10 Juli 2002", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234","3 Maret 1999", 5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker("Sarah", "456", "15 Juni 2000", 2.5, 1000);
        PieceWorker pieceWorker2 = new PieceWorker("Gala", "247", "18 Mei 2001", 2.5, 1000);
        PieceWorker pieceWorker3 = new PieceWorker("Fuji", "902", "20 April 202", 2.5, 1000);
        PieceWorker pieceWorker4 = new PieceWorker("Faiz", "572", "10 Januari 2005", 2.5, 1000);

        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan:	", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan:	", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan:	", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[8];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;
        employees[5] = pieceWorker2; 
        employees[6] = pieceWorker3;
        employees[7] = pieceWorker4;

        System.out.println("Employees	diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }

    }
}
