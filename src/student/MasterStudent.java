package student;

import enums.Sex;

import java.util.Date;

public class MasterStudent extends GraduateStudent {
    public MasterStudent(Sex sex, int no, String name, int year, Date date, String major) {
        super(sex, no, name, year, date, major);
    }

    @Override
    public void study() {
        System.out.println("Master student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Master student is registering.");
    }

}
