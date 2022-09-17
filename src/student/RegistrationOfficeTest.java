package student;

public class RegistrationOfficeTest {
    public static void main(String[] args) {

        RegistrationOffice registrationOffice = new RegistrationOffice();

        AbstractStudent student1 = registrationOffice.getAStudent();
        registrationOffice.registerStudent(student1);

        AbstractStudent student2 = registrationOffice.getAStudent();
        registrationOffice.registerStudent(student2);

    }
}
