package student;

import enums.Sex;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

    public PhdStudent(Sex sex, int no, String name, int year, Date date, String major) {
        super(sex, no, name, year, date, major);
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
