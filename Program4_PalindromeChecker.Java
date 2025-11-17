import java.util.Scanner;

class Program4_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();
        
        // Remove spaces and convert to lowercase for comparison
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        System.out.println("\nOriginal: " + input);
        System.out.println("Cleaned: " + cleaned);
        System.out.println("Reversed: " + reversed);
        
        if (cleaned.equals(reversed)) {
            System.out.println("✓ YES! This is a palindrome.");
        } else {
            System.out.println("✗ NO! This is not a palindrome.");
        }
        
        sc.close();
    }
}


        
