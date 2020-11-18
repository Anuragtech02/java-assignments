import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {
	System.out.println("Enter the term up to which series is to be printed:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
	int first_term = 0, second_term = 1, third_term = 1;
	for(int i = 0; i < n; i++){
		if(i == 0)
			System.out.print("0 ");
		else if(i == 1)
			System.out.print("1 ");
		else{
			third_term = first_term + second_term;
			System.out.print(third_term + " ");
			first_term = second_term;
			second_term = third_term;
		}
	}
	}
}