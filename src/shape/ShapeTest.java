package shape;

public class ShapeTest {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.draw();
        System.out.println(circle.getName() + "'s area value is " + circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLongEdge(10);
        rectangle.setShortEdge(5);
        System.out.println(rectangle.getName()+ "'s circum ference value is " + rectangle.calculateCircumference());
    }
}
