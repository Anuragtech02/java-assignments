public class ConcatenateString {

    public static void main(String[] args)
    {
        String str1 = "Cpp and ";
        String str2 = "Java";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
        String str3 = str1 + str2;

        System.out.println("The concatenated string: " + str3);
    }
}