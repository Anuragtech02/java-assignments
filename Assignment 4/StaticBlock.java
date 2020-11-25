public class StaticBlock {

    static int k;
    static {
        System.out.println("Value of K Before static block Initialise the value of K = " + k);
        k = 10;
    }

    public static void main(String args[]) {
        new StaticBlock();
        System.out.println("Value of K After static block Initialise the value of K = " + StaticBlock.k);
    }
}
