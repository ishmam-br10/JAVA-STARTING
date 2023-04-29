import java.awt.*;
public class circle_n{
    Point center;
    double radius;
    circle_n(){}
    circle_n(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    double getPerimeter(){
        return 2* Math.PI * this.radius;
    }
    double getArea(){
        return Math.PI* this.radius * this.radius;
    }
    void setCenter(Point center){
        this.center = center;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
}
