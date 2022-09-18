package exception;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee("IT", "Sümeyye", 8, 15);
        System.out.println(employee.calculateSalary());

    }
}
