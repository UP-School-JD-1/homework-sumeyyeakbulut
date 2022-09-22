package exception;

import enums.Sex;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee("IT", Sex.WOMEN, "Sümeyye", 8, 15);
        System.out.println(employee.calculateSalary());

        System.out.println(employee.getSex().getHeOrShe());
        System.out.println(employee.getSex().getValue());

        Manager manager = new Manager("HR", Sex.MEN, "Hamza", 188, 3, "HR");
        manager.prinInfo();

    }
}
