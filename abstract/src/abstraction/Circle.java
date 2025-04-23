package abstraction;

public class Circle extends Shape {
    double radius;
    double area;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Area of circle :");
        System.out.println ("area:" + area);
    }
}
