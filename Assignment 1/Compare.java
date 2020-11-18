import java.util.Scanner;

public class Compare {
    public static void main(String args[]) {
        System.out.println("Compare Numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to compare : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        input.close();
        if (a > b)
            System.out.println(a + " is greater than " + b);
        else if (b < a)
            System.out.println(b + " is greater than " + a);
        else
            System.out.println("Both numbers are equal!");
    }
}
