package exception;

public class Employee {

    protected String department;
    protected String name;
    protected int no;
    protected int year;

    protected static final int BASE_SALARY = 1000;

    public Employee(String department, String name, int no, int year){
        this.department = department;
        this.name = name;
        this.no = no;
        this.year = year;
    }

    public void work(){
        System.out.println("Employee is working");
    }

    public void prinInfo(){
        System.out.println(name + "is working in " + department + " department.");
    }

    public double calculateSalary(){
        return BASE_SALARY * year;
    }
}
