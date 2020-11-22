import java.io.File;
public class SizeOfFile 
{
    public static void main(String[] args) 
    {
        System.out.println("Size of file OctalToDecimal.java is : " + new File("OctalToDecimal.java").length() + " bytes");
        System.out.println("Size of file OctalToBinary.java is : " + new File("OctalToBinary.java").length() + " bytes");
    }
}