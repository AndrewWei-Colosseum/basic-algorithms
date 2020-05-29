package learing_java;

public class Triangle extends Shape{
    double sideA, sideB, sideC;
    public Triangle() {
        name = "equal triangle";
        sideA = 1.0;
        sideB = 1.0;
        sideC = 1.0;
    }
    public Triangle(double sideA, double sideB, double sideC) {
        name = "random triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getArea() {
        double s = 0.5*(sideA+sideB+sideC);
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
}


