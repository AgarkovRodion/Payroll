package departments;

public class Department {
    public int idEmployee;
    public String nameOfDepartment;
    public int amountOfWorkers;
    public double coefficientOfEfficiency;
    public double salary;
    public Department(){}

    public Department(int idEmployee, String nameOfDepartment, int amountOfWorkers,
                      double coefficientOfEfficiency, double salary) {

        this.idEmployee = idEmployee;
        this.nameOfDepartment = nameOfDepartment;
        this.amountOfWorkers = amountOfWorkers;
        this.coefficientOfEfficiency = coefficientOfEfficiency;
        this.salary = salary;
    }
    public void countSalary() {

        if(coefficientOfEfficiency >= 1.0) {
            salary = salary * 2;
        }
        else if(coefficientOfEfficiency < 1.0) {
            salary = salary * 0.8;
        }
        System.out.println("Зарплата сотрудника - " + salary);
    }
}
