package exception;

public class Manager extends Employee {

    protected String departmentManaged;

    static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(String department, String name, int no, int year, String departmentManaged) {
        super(department, name, no, year);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + MANAGEMENT_PAYMENT;
    }
}
