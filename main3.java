class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
}

public class main3{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area: " + shape.getArea()); // Outputs: Area: 0.0
        
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.getArea()); // Outputs: Area: 50.0
    }
}
