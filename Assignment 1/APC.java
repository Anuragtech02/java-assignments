import java.util.Scanner;

public class APC {
    final static double pi = 3.14;

    public static void main(String args[]) {
        System.out.println("Area and Perimeter of a circle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        double radius = input.nextDouble();
        input.close();
        System.out.println("Area of the circle is : " + (pi * radius * radius));
        System.out.println("Perimeter of the circle is : " + (2 * pi * radius));
    }
}
