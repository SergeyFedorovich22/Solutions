package Les_27;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    private double dis;
    private double x1;
    private double x2;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setDis() {
        this.dis = Math.pow(this.b,2)-4*this.a*this.c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void currentDis(){
        this.dis = Math.pow(this.b,2)-4*this.a*this.c;
        if (this.dis > 0)
            System.out.println("Discriminant above zero = " + this.dis);
        else if (this.dis < 0 )
            System.out.println("Discriminant less then zero = " + this.dis);
        else if (this.dis == 0)
            System.out.println("Discriminant zero = " + this.dis);
    }

    public void calculationOfRoots(){
        this.dis = Math.pow(this.b,2)-4*this.a*this.c;
        if (this.dis < 0)
            System.out.println("No roots");
        else if (this.dis == 0) {
            this.x1 = (-this.b + Math.sqrt(this.dis))/(2*this.a);
            this.x2 = this.x1;
            System.out.println("One root = " + this.x1);
        }
        else if (this.dis > 0) {
            this.x1 = (-this.b + Math.sqrt(this.dis))/(2*this.a);
            this.x2 = (-this.b - Math.sqrt(this.dis))/(2*this.a);
            System.out.println("Root one = " + this.x1);
            System.out.println("Second root = " + this.x2);
        }
    }
}
