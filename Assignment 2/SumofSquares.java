import java.util.Scanner;

public class SumofSquares {
    // Function to calculate sum
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);

        return sum;
    }

    // Driver code
    public static void main(String args[]) {
        System.out.println("Enter the term upto which you want the series printed upto : ");
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();
        System.out.println(summation(i));
        n.close();
    }
}
