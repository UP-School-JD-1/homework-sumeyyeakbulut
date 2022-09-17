package shape;

public abstract class Shape {

    private final String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void draw(){
        System.out.println(name + "is drawing");
    }

    public void erase(){
        System.out.println(name + "is erasing");
    }

    abstract double calculateArea();

    abstract double calculateCircumference();
}
