    //Java Program to demonstrate the use of Integer.parseInt() method  
    //for converting Octal to Decimal number  
    
    import java.util.Scanner ;

    public class Octal_To_Decimal{  
        public static void main(String args[])
        {  
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter an octal number you want to convert to decimal : ");
            //Declaring an octal number  
            String octalString = sc.nextLine();  

            //Converting octal number into decimal  
            int decimal=Integer.parseInt(octalString,8);  
            //Printing converted decimal number  
            System.out.println("the decimal number is : " + decimal);  
            sc.close();
        }
    }  
