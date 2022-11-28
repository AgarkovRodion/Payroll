package departments;

public class PCCenter extends AccountingDepartment {

    double salaryCenter;
    double coefficientOfEfficiency;


    public PCCenter(int prize, int fine, boolean fines, double salaryCenter, double coefficientOfEfficiency) {
        super(prize, fine, fines);
        this.salaryCenter = salaryCenter;
        this.coefficientOfEfficiency = coefficientOfEfficiency;
    }

    public void payday(){
        if(coefficientOfEfficiency > 1.0) {
            salaryCenter = salaryCenter * 2;
        }
        else if(coefficientOfEfficiency < 1.0) {
            salaryCenter = salaryCenter * 0.8;
        }
        System.out.println("Зарплата сотрудника вычислительного центра - " + salaryCenter);
    }
}
