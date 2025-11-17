import java.util.Scanner;

class Program2_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();
        
        System.out.println("\nFibonacci Series (" + n + " terms):");
        
        long first = 0, second = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            long next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println();
        sc.close();
    }
}

