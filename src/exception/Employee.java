package exception;

import enums.Sex;

public class Employee {

    protected String department;
    protected String name;
    protected int no;
    protected int year;
    protected final Sex sex;

    protected static final int BASE_SALARY = 1000;

    public Employee(String department, Sex sex, String name, int no, int year){
        this.department = department;
        this.sex = sex;
        this.name = name;
        this.no = no;
        this.year = year;
    }

    public Sex getSex(){
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void work(){
        System.out.println("Employee is working");
    }

    public void prinInfo(){
        System.out.println(name + " is working in " + department + " department.");
    }

    public double calculateSalary(){
        return BASE_SALARY * year;
    }
}
