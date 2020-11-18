import java.text.*;

class AvgofArray {
    public static void main(String args[]) {
        //declaring req variables
        double sum = 0.0;
        double ans = 0;

        //declaring array to be averaged
        int arr[] = {1 , -3, 5, 6, 10, 16};


        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        ans = sum / arr.length;

        //truncating decimal to 3 digits precision only
        DecimalFormat dec = new DecimalFormat("###.###");

        System.out.println("Average of arguments is " + dec.format(ans));

    }
}