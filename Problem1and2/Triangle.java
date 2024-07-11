

public class Triangle extends Shape {
    //instance variables
    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        // if statement to determine if the triangle is possible
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            //error handling
            throw new IllegalArgumentException("Invalid sides for a triangle");
        }
    }

    //methods
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //method to scale shape
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
    
}
