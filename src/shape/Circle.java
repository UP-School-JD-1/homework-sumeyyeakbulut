package shape;

public class Circle extends Shape {

    private double radius;

    public Circle(){
        super("Circle");
    }

    public Circle(double radius){
        this();
        this.radius = Math.abs(radius);
    }

    public void setRadius(double radius){
        this.radius = Math.abs(radius);
    }

    public double getRadius(){
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
