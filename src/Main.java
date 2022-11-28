import departments.Department;
import departments.AccountingDepartment;
import departments.HRDepartment;
import departments.PCCenter;

public class Main {
    public static void main(String[] args) {
        //реализация расчёта зарплаты сотрудникам Вычислительного центра
        HRDepartment hrDepartment = new HRDepartment(true, "Виталий",
                "Кошкин");
        hrDepartment.checkWorker();

        Department department = new Department(1,"",
                2546,1.0, 70000);
        department.countSalary();

        AccountingDepartment accountingDepartment = new AccountingDepartment(0, 1000, false);
        accountingDepartment.countPay();

        PCCenter pcCenter = new PCCenter(1000, 0, false, 65000, 1.5);
        pcCenter.payday();
        System.out.println("Check changes");
    }
}