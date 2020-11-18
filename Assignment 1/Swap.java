public class Swap {
    public static void main(String args[]) {
        int a = 2, b = 3;
        // Output : 2 3
        System.out.println("Before Swapping : " + a + " " + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        // Output : 3 2
        System.out.println("After Swapping : " + a + " " + " " + b);
    }
}