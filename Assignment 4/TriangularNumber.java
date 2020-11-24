import java.util.Scanner;

public class TriangularNumber {
    public static int triangularNo(int n){
        if(n == 0)
            return 0;
        
        else if(n == 1)
            return 1;
        
        else
            return triangularNo(n-1) + n;
    }
           
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nth no of which you want triangular number printed");
        int index = sc.nextInt();

        int tno = triangularNo(index);

        System.out.println("The triangular number of " + index + " is "+ tno);
        sc.close();
    }
    
}
