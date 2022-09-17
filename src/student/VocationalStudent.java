package student;

import java.util.Date;

public class VocationalStudent extends AbstractStudent {

    public VocationalStudent(int no, String name, int year, Date date, String major) {
        super(no, name, year, date, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Vocational student is registering.");
    }

}
