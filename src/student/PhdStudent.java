package student;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

    public PhdStudent(int no, String name, int year, Date date, String major) {
        super(no, name, year, date, major);
    }

    @Override
    public void study() {
        System.out.println("Phd student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Phd student is registering.");
    }
}
