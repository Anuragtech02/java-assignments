import java.util.Scanner;

public class Cel2Fahr {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        float C = input.nextFloat();
        input.close();
        
        float F = C * (9f / 5) + 32;
        
        System.out.println(C + " deg C is = " + F +" deg Fahrenheit.");
       
    }
}