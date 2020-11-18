import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rem = 0;
        int sum = 0;
        sc.close();

        while (n > 0) {
            rem = n % 10;
            n /= 10;
            sum += rem;
        }

        System.out.println("Sum of digits is : " + sum);
    }
}