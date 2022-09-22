package exception;

import enums.Sex;

public class Director extends Manager{

    private double bonus;

    public Director(String department, Sex sex, String name, int no, int year, String departmentManaged, double bonus) {
        super(department, sex, name, no, year, departmentManaged);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void prinInfo() {
        super.prinInfo();
        System.out.println("And also ");
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
    }
}
