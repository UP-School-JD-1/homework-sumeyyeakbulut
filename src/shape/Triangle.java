package shape;

public class Triangle extends Shape{

    private double edge;

    public Triangle() {
        super("Triangle");
    }

    public Triangle(double edge){
        this();
        this.edge = Math.abs(edge);
    }

    public void setEdge(double edge){
        this.edge = Math.abs(edge);
    }

    public double getEdge(){
        return edge;
    }

    @Override
    double calculateArea() {
        return Math.pow(edge, 2) * Math.sqrt(3) / 4;
    }

    @Override
    double calculateCircumference() {
        return 3 * edge;
    }
}
