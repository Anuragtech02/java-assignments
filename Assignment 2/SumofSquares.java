import java.util.Scanner;

public class SumOfSquares {

    public static void main(String args[]) {
	System.out.println("Enter the value upto which sum is to be calculated:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
	int sum = 0;
	for(int i = 0; i < n; i++){
		sum = sum + i*i;
	}
	System.out.println("Sum of series is:" + sum);
}
}