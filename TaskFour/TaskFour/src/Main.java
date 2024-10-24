public class Main {
    public static void main(String[] args){

        Shape circle = new Circle(4);
        Shape square = new Square(6);

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println("Circle area: "+circle.getArea());
        System.out.println("Square area: "+square.getArea());
        System.out.println("Total area of all shapes: "+shapeBuilder.getTotalArea());
    }
}
