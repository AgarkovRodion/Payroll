package departments;

public class HRDepartment extends Department{
    public boolean isAnEmployee = false;
    public String nameOfEmployee;
    public String surnameOfEmployee;

    public HRDepartment(){}
    public HRDepartment(boolean isAnEmployee, String nameOfEmployee, String surnameOfEmployee) {

        this.isAnEmployee = isAnEmployee;
        this.nameOfEmployee = nameOfEmployee;
        this.surnameOfEmployee = surnameOfEmployee;
    }

    public void checkWorker() {

        if ((idEmployee != 0) && (!nameOfEmployee.isEmpty())
                && (!surnameOfEmployee.isEmpty())) {
            isAnEmployee = true;
        }
        else {
            isAnEmployee = false;
        }
    }
}
