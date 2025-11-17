class Rectangle {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    // Getter methods
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    // Display method
    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

class Program5_RectangleDemo {
    public static void main(String[] args) {
        System.out.println("=== Rectangle Class Demonstration ===\n");
        
        // Creating Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(10.5, 7.2);
        Rectangle rect3 = new Rectangle(4.0, 4.0);
        
        System.out.println("Rectangle 1:");
        rect1.display();
        
        System.out.println("\nRectangle 2:");
        rect2.display();
        
        System.out.println("\nRectangle 3:");
        rect3.display();
    }
}

