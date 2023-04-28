import java.awt.*;
public class constructors {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 2), 03);
        System.out.println(c1.center);
        System.out.println(c1.radius);
        System.out.println(c1);
    }
}
class Circle{
    Point center;
    double radius;
    Circle(Point initialCenter, double initialRadius){
        center = initialCenter;
        radius = initialRadius;
    }
}