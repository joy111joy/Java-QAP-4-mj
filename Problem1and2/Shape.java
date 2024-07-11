abstract class Shape implements Scalable{
    //instance variable
    protected String name;

    //constructor
    public Shape(String name) {
        this.name = name;
    }

    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    //toString method
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}