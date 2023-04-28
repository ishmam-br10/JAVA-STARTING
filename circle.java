import java.awt.*;

public class circle {
    Point center;
    double radius;
    double getPerimeter(){
        return 2* Math.PI * radius;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
    void setCenter(Point newCenter){
        center = newCenter;
    }

public static void main(String[] args) {
    circle c1 = new circle();
    System.out.println(c1.center);
    c1.center = new Point(0, 0);
    c1.radius = 3;
    System.out.println(c1.center);
    System.out.println(c1.radius);
    c1.setRadius(5);
    System.out.println(c1.radius);
}
}
// public class DefaultValues {
//     Position point;
//     String str;
//     double d;
//     char c;
//     boolean b;    
// }