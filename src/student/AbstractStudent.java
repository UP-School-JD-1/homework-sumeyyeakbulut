package student;

import enums.Sex;

import java.util.Date;

public abstract class AbstractStudent implements Student{

    private int no;
    private String name;
    private int year;
    private Date date;
    private String major;
    private final Sex sex;

    public AbstractStudent(Sex sex, int no, String name, int year, Date date, String major){
        this.sex = sex;
        this.no = no;
        this.name = name;
        this.year = year;
        this.date = date;
        this.major = major;
    }

    public String getName() {
        return name;
    }
}
