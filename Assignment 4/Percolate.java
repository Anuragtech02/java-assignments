// Output is given below, justification is given in comments in corresponding lines

public class Percolate {
    public static void main (String[] args) {
        int[] dataSeq = {6,4,8,2,1};
        printIntArray(dataSeq);
        
        //loop iterating over the length of given array i.e dataSeq
        for (int index = 1; index < dataSeq.length; ++index)
            //Contition for swapping correspondin elements if former is greater than the latter.
            if (dataSeq[index-1] > dataSeq[index])
                swap(dataSeq, index-1, index);
            
            printIntArray(dataSeq);
        }
        
        // swap function changes the value for two given positional arguments in a list
        public static void swap(int[] intArray, int i, int j) {
            int tmp = intArray[i]; intArray[i] = intArray[j]; intArray[j] = tmp;
        }

        // swap function for interchanging values of two elements given as arguments.
        public static void swap(int v1, int v2) {
            int tmp = v1; v1 = v2; v2 = tmp;
        }

        // function for printing a given array
        public static void printIntArray(int[] array) {
            for (int value : array)
                System.out.print(" " + value);
                System.out.println();
        }
        
        
}

// Output
// 6 4 8 2 1
// 4 6 2 1 8
