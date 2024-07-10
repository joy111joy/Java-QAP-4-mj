public class Demo {
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Ellipse("Ellipse", 3, 5);
        shapes[1] = new Circle("Circle", 7);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);
        
        System.out.println("Pre scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        System.out.println("\nPost scaling:");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }


}

