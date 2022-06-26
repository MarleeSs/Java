/*
 Rumus Fibonacci
    fn = fn-2 + fn-1
 */
package Fibonacci;

import static java.lang.System.*;
import java.util.*;

public class FibAngka {

  public static void main(String[] args) {
    int fn, fnMin1, fnMin2, n;
    fnMin1 = 0;
    fnMin2 = 1;

    try (Scanner inpuUser = new Scanner(in)) {
      out.print("Mengambil nilai Fibonacci ke- ");
      n = inpuUser.nextInt();
    }
    for (int i = 1; i <= n; i++) {
      fn = fnMin2 + fnMin1;
      fnMin2 = fnMin1;
      fnMin1 = fn;

      out.printf("Nilai Fibonacci ke- %d = %d \n", i, fn);
    }
  }
}
