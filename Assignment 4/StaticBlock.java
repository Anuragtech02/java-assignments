public class StaticBlock {

    static int k;
    static {
        System.out.println("Value Before static Initialisation Block Ran: K = " + k);
        k = 10;
    }

    public static void main(String args[]) {
        new StaticBlock();
        System.out.println("Value After static Initialisation Block Ran: K = " + StaticBlock.k);
    }
}
