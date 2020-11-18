import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        System.out.println("******Calculator********");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two numbers : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double result = 0;
        System.out.println("Please enter operator (+,-,*,/, %) [ex. + for addition]");
        char choice;
        choice = input.next().charAt(0);
        input.close();
        switch (choice) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Cannot divide by zero :( ");
                    return;
                }
                break;
            case '%':
                if (b != 0)
                    result = a % b;
                else {
                    System.out.println("Cannot divide by zero :( ");
                    return;
                }
            default:
                System.out.println("Invalid Input!");
                break;
        }
        if (b != 0) {
            System.out.println("Result is : " + result);
        }
    }
}
