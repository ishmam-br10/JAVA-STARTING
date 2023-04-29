import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        System.out.println(circle_n.getnumberofCircles());
        circle_n c1 = new circle_n(new Point(1, 2), 5);
        circle_n c2 = new circle_n(new Point(2, 3), 2);
        // c1.radius = 1;
        // c2.radius = 2;
        System.out.println(c1.radius);
        System.out.println(c2.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(circle_n.getnumberofCircles());
    }
}
