import java.util.Scanner;

public class Factorial {

    public static double calcFactorial(int n) {
        double fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        System.out.print("Enter number to calculate Factorial : ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        System.out.println("Factorial of : " + n + " is " + calcFactorial(n));
    }
}
