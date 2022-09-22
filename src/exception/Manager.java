package exception;

import enums.Sex;

public class Manager extends Employee {

    protected String departmentManaged;

    static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(String department, Sex sex, String name, int no, int year, String departmentManaged) {
        super(department, sex, name, no, year);
        this.departmentManaged = departmentManaged;
    }

    public String getDepartmentManaged(){
        return departmentManaged;
    }

    @Override
    public void prinInfo() {
        super.prinInfo();
        System.out.println("And " + getSex().getHeOrShe() +" is managing " + departmentManaged + " department");
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + MANAGEMENT_PAYMENT;
    }
}
