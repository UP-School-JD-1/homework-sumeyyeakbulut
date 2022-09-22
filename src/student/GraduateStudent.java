package student;

import enums.Sex;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {

    private String advisor;
    private String thesis;

    public GraduateStudent(Sex sex, int no, String name, int year, Date date, String major) {
        super(sex, no, name, year, date, major);
    }

    public void setAdvisor(String advisor){
        this.advisor = advisor;
    }

    public String getAdvisor(){
        return advisor;
    }

    public void setThesis(String thesis){
        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduate student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Graduate student is registering.");
    }


    public void writeThesis() {
        System.out.println("Writing thesis");
    }
}
