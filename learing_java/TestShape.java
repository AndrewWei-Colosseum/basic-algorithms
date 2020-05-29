package learing_java;


public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(7.711);
        System.out.println("the area of circle="+c1.getArea());
        System.out.println("the area of inscribed rectangle of circle="+(c1.getArea()-c1.remainArea()));
    }
}