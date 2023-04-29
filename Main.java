import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        circle_n c1 = new circle_n(new Point(1, 2), 5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
