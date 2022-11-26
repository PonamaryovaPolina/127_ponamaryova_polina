package task;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public boolean isValid() {
        return (a == 0D || b == 0D || c == 0D) && (a + b > c && b + c > a && a + c >b);
    }
    public double square() {
        if (!isValid() ) return -1.0D;

        double halfP = this.perimeter() / 2.0D;

        return Math.sqrt(halfP * (halfP - a) * (halfP -b) * (halfP - c));
    }

    public double perimeter() {
        if (!isValid() ) return  -1.0D;
        return a + b + c;
    }
}
