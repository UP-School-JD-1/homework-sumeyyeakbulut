package shape;

public class Rectangle extends Shape{

    private double longEdge;
    private double shortEdge;

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(double longEdge, double shortEdge){
        this();
        this.longEdge = Math.abs(longEdge);
        this.shortEdge = Math.abs(shortEdge);
    }

    public void setLongEdge(double longEdge){
        this.longEdge = Math.abs(longEdge);
    }

    public double getLongEdge(){
        return longEdge;
    }

    public void setShortEdge(double shortEdge){
        this.shortEdge = Math.abs(shortEdge);
    }

    public double getShortEdge(){
        return shortEdge;
    }

    @Override
    double calculateArea() {
        return shortEdge * longEdge;
    }

    @Override
    double calculateCircumference() {
        return 2 * (longEdge + shortEdge);
    }
}
