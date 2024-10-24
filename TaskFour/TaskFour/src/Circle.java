import static java.lang.Math.PI;

public class Circle implements Shape{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
