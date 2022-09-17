package student;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent{

    public UndergraduateStudent(int no, String name, int year, Date date, String major) {
        super(no, name, year, date, major);
    }

    @Override
    public void study() {
        System.out.println("Undergraduate student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Undergraduate student is registering.");
    }

}
