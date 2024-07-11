public class Ellipse extends Shape{
    //instance variables
    private double a;
    private double b;
    
    //constructor
    public Ellipse(String name, double a, double b) {
        super(name);
        // if statement to determine which value is greater and to assign that  value as the major axis
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    //methods
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }

    //method to scale shape
    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}

