package Array;

import java.util.Arrays;

public class ArrayCode {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    System.out.println("Array Integer To String > " + Arrays.toString(arr));

    // Looping for each
    for (int baris : arr) {
      System.out.println("Baris Ke > " + baris);
    }
    System.out.println(arr.length);

    // Looping for Biasa
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Baris Ke > " + arr[i]);
    }
  }
}
