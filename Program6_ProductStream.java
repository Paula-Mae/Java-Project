import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    
    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return String.format("Product: %-20s Price: $%.2f", name, price);
    }
}

class Program6_ProductStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create ArrayList of Products
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 899.99));
        products.add(new Product("Mouse", 25.50));
        products.add(new Product("Keyboard", 75.00));
        products.add(new Product("Monitor", 299.99));
        products.add(new Product("USB Cable", 12.99));
        products.add(new Product("Headphones", 150.00));
        products.add(new Product("Webcam", 89.99));
        products.add(new Product("Desk Lamp", 35.00));
        
        System.out.println("=== Product Inventory ===");
        System.out.println("Total products: " + products.size());
        System.out.println("\nAll Products:");
        products.forEach(System.out::println);
        
        // Get user input for price threshold
        System.out.print("\nEnter minimum price to filter expensive products: $");
        double threshold = sc.nextDouble();
        
        // Use stream, filter with lambda, and count
        long expensiveCount = products.stream()
                                      .filter(p -> p.getPrice() > threshold)
                                      .count();
        
        System.out.println("\n=== Filter Results ===");
        System.out.printf("Number of products with price > $%.2f: %d\n", 
                         threshold, expensiveCount);
        
        System.out.println("\nExpensive Products:");
        products.stream()
                .filter(p -> p.getPrice() > threshold)
                .forEach(System.out::println);
        
        sc.close();
    }

}
