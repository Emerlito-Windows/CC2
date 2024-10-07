import java.util.Scanner;
public class GroceryStoreCal {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the total purchase amount
        System.out.print("Enter the total purchase amount (in PHP): ");
        double totalAmount = scanner.nextDouble();
        
        // Declare variables for discount rate and final price
        double discountRate = 0.0;
        double discountAmount = 0.0;
        double finalPrice;
        
        // Apply discount based on total amount
        if (totalAmount < 1000) {
            discountRate = 0.0;
        } else if (totalAmount <= 5000) {
            discountRate = 0.05; // 5% discount
        } else if (totalAmount <= 10000) {
            discountRate = 0.10; // 10% discount
        } else {
            discountRate = 0.15; // 15% discount
        }
        
        // Calculate the discount amount and the final price
        discountAmount = totalAmount * discountRate;
        finalPrice = totalAmount - discountAmount;
        
        // Display the discount applied and the final price
        System.out.println("Discount applied: " + (int)(discountRate * 100) + "%");
        System.out.println("Final price after discount: PHP " + finalPrice);
        
        // Close the scanner
        scanner.close();
    }
}
