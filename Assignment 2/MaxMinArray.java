public class MaxMinArray {
  public static void main(String[] args) {

    int arr[] = { 400, 24, -4, 0, 2, 45, 3, -208, 7 };

    // assign first array element to two variables
    int max = arr[0];
    int min = arr[0];

    // iterate and compare from array index 1
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      } else if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("Maximum number = " + max + " Minimum number = " + min);
  }
}