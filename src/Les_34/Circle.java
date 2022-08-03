package Les_34;

public class Circle {
    static double pi;
    double radius;
    double square;
    double circuit;

    public Circle(int radius) {
        this.radius = radius;
        this.square = pi * Math.pow(radius, 2);
        this.circuit = 2 * pi * radius;
    }
    @Override
    public String toString(){
        return "Radius = " + this.radius
                + " Square - " + this.square
                + " Circumference - " + this.circuit;
    }
}
