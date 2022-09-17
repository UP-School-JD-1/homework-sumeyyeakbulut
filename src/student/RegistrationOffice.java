package student;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

    public void registerStudent(AbstractStudent abstractStudent) {
        if (abstractStudent instanceof GraduateStudent)
            System.out.println("Graduate student " + abstractStudent.getName() + " has registered");

        else if (abstractStudent instanceof MasterStudent)
            System.out.println("Master student " + abstractStudent.getName() + " has registered");

        else if (abstractStudent instanceof PhdStudent)
            System.out.println("Phd student " + abstractStudent.getName() + " has registered");

        else if (abstractStudent instanceof UndergraduateStudent)
            System.out.println("Undergraduate student " + abstractStudent.getName() + " has registered");

        else if(abstractStudent instanceof VocationalStudent)
            System.out.println("Vocational student " + abstractStudent.getName() + " has registered");
    }


    public AbstractStudent getAStudent() {
        AbstractStudent student = null;
        Random r = new Random();
        int i = r.nextInt(6);
        switch (i) {
            case 1:
                student = new VocationalStudent(219, "Sümeyye", 1998, new Date(1995, 06, 6), "Mathematics");
                break;
            case 2:
                student = new GraduateStudent(250, "İslim", 1997, new Date(1970, 11, 9), "Mathematics Engineer");
                break;
            case 3:
                student = new UndergraduateStudent(168, "Mustafa", 1975, new Date(1980, 04, 8), "Engineer");
                break;
            case 4:
                student = new MasterStudent(158, "Ahmet", 1996, new Date(1980, 11, 15), "Statistic");
                break;
            default:
                student = new PhdStudent(285, "İlayda", 1995, new Date(1975, 05, 18), "Engineer");
                break;

        }

        return student;
    }

}
