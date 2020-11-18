import java.util.Scanner;

public class HexagonArea {

    public static double calcArea(double s) {
        return ((3 * Math.sqrt(3) * (s * s)) / 2);
    }

    public static void main(String args[]) {
        System.out.print("Enter length of side to calculate area : ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        input.close();
        System.out.println("Area of the given Hexagon is : " + calcArea(side));
    }
}
