package book;

public class Reader {

    String name;
    int age;
    char sex;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public char getSex(){
        return sex;
    }

    public void read(Book book){
        System.out.println(name + " güncel olarak "+ book.getTitle() +" kitabını okumaktadır.");
    }
}
