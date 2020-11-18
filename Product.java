import java.util.Scanner;

public class Product {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        input.close();
        System.out.println("Product of " + a + " & " + b + " is " + a * b);
    }
}
