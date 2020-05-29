package learing_java;

public class Circle extends Shape{
    double radius;
    public Circle() {
        name = "standard circle";
        radius = 1.0;
    }
    public Circle(double radius) {
        name = "normal circle";
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double remainArea() {
        Polygon p1 = new Polygon(radius, radius, radius);
        return getArea() - p1.getArea();
    }
    class Polygon {
        Triangle t1;
        Polygon(double a, double b, double c) {
            t1 = new Triangle(a,b,c);
        }
        double getArea() {
            return t1.getArea()*6;
        }
    }

    
}