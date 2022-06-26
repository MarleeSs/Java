package Array;

import java.util.Arrays;

public class UbahArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arr2 = new int[10];

    System.out.println("Array Integer To String > " + Arrays.toString(arr));
    ubahArray(arr);
    System.out.println("Array Integer To String > " + Arrays.toString(arr));

  }

  private static void ubahArray(int[] data) {
    for (int index = 0; index < data.length; index++) {
      data[index] = data[index] * 60;
    }
  }
}
