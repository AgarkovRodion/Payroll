package departments;

public class AccountingDepartment extends HRDepartment {
    int prize;
    int fine;

    public AccountingDepartment(int prize, int fine, boolean fines) {
        this.prize = prize;
        this.fine = fine;
        this.fines = fines;
    }

    boolean fines;
    public void countPay() {
        checkFine();

        if (fines) {
            salary = salary - fine;
        }
        else {
            salary = salary + prize;
        }
    }

    private void checkFine() {
        if (coefficientOfEfficiency > 1.0) {
            prize = 500;
            System.out.println("Ваша премия составляет - " + prize);
        }
        else if (coefficientOfEfficiency ==1.0) {
            prize = 0;
            fine = 0;
            fines = false;
        }
        else {
            prize = 0;
            fine = 1000;
            fines = true;
            System.out.println("Ваш штраф составляет - " + fine);
        }
    }
}
