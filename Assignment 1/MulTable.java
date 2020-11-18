import java.util.Scanner;

public class MulTable {
    public static void main(String args[]) {
        System.out.print("Enter a number to print table : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        System.out.println("Multipliation table of " + a + " ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
