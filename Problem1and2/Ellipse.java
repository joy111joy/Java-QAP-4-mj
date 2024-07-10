public class Ellipse extends Shape{
    private double a;
    private double b;
    
    public Ellipse(String name, double a, double b) {
        super(name);
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}

