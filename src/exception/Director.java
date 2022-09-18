package exception;

public class Director extends Manager{

    private double bonus;

    public Director(String department, String name, int no, int year, String departmentManaged, double bonus) {
        super(department, name, no, year, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
    }
}
