import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        System.out.print("Enter a number to check : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n, rem;
        int sum = 0;
        input.close();
        while (n > 0) {
            rem = n % 10;
            n /= 10;
            sum += rem * rem * rem;
        }
        if (temp == sum) {
            System.out.println("Yes, it's an Armstrong number :)");
        } else {
            System.out.println("No not an Armstrong Number!");
        }
    }
}
