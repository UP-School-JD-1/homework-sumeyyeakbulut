package shape;

public class Square extends Shape{

    private double edge;

    public Square() {
        super("Square");
    }

    public Square(double edge){
        this();
        this.edge = Math.abs(edge);
    }

    public void setEdge(double edge){
        this.edge = Math.abs(edge);
    }

    public double getEdge(double edge){
        return edge;
    }

    @Override
    double calculateArea() {
        return Math.pow(edge, 2);
    }

    @Override
    double calculateCircumference() {
        return edge * 4;
    }
}
