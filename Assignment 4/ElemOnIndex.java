import java.util.Scanner;


public class ElemOnIndex {
    public static int indexof(int num, int index){
         do{
            num = num/10;
            index -= 1;        }
         while(index != 0);

        return num%10;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("enter the index (from right) you want to print the digit of");
        int n = sc.nextInt();

        int indexedElem = indexof(num, n);

        System.out.println("The element on index " + n + " is " + indexedElem);
        sc.close();
    }
    
}
