import java.util.Scanner;

public class SumOfFactorial {

	public static double calcFactorial(int n) {
        double fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]) {
	System.out.println("Enter the value upto which sum is to be calculated:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
	double sum = 1;
	for(int i = 1; i < n; i++){
		sum = sum + ( i / calcFactorial(i) );
	}
	System.out.println("Sum of series is:" + sum);
}
}