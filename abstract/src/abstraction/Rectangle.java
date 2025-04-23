package abstraction;

public class Rectangle extends Shape {
    double area;
    int width;
    int height;


    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }
    @Override
    void calculateArea(){
        area = width * height;
        System.out.println("Rectangle calculateArea :");
        System.out.println ("area:" + area);
    }


}
// class Circle extends Shape{
//
//}
