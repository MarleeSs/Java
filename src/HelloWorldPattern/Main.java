package HelloWorldPattern;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    B1();
    B2();
    B3();
    B4();
    B5();
  }

  static void B1() {
    int x;

    for (x = 1; x <= 60; x++) {
      if ((x == 1 || x == 5) || // H
          (x > 6 && x < 12) || // E
          (x == 13) || // L
          (x == 19) || // L
          (x > 24 && x < 30) || // O
          (x == 32 || x == 36) || // W
          (x > 37 && x < 43) || // O
          (x > 43 && x < 49) || // R
          (x == 50) || // L
          (x > 55 && x < 60))// D
        out.print("* ");
      else
        out.print("  ");
    }
    out.println();
  }

  static void B2() {
    int x;

    for (x = 1; x <= 60; x++) {
      if ((x == 1 || x == 5) || // H
          (x == 7) || // E
          (x == 13) || // L
          (x == 19) || // L
          (x == 25 || x == 29) || // O
          (x == 32 || x == 36) || // W
          (x == 38 || x == 42) || // O
          (x == 44 || x == 48) || // R
          (x == 50) || // L
          (x == 56 || x == 60))// D
        out.print("* ");
      else
        out.print("  ");
    }
    out.println();
  }

  static void B3() {
    int x;

    for (x = 1; x <= 60; x++) {
      if ((x > 0 && x < 6) || // H
          (x > 6 && x < 12) || // E
          (x == 13) || // L
          (x == 19) || // L
          (x == 25 || x == 27 || x == 29) || // O
          (x == 32 || x == 36) || // W
          (x == 38 || x == 40 || x == 42) || // O
          (x > 43 && x < 49) || // R
          (x == 50) || // L
          (x == 56 || x == 58 || x == 60))// D
        out.print("* ");
      else {
        out.print("  ");
      }
    }
    out.println();
  }

  static void B4() {
    int x;

    for (x = 1; x <= 60; x++) {
      if ((x == 1 || x == 5) || // H
          (x == 7) || // E
          (x == 13) || // L
          (x == 19) || // L
          (x == 25 || x == 29) || // O
          (x == 32 || x == 34 || x == 36) || // W
          (x == 38 || x == 42) || // O
          (x == 44 || x == 46) || // R
          (x == 50) || // L
          (x == 56 || x == 60))// D
        out.print("* ");
      else
        out.print("  ");
    }
    out.println();
  }

  static void B5() {
    int x;

    for (x = 1; x <= 60; x++) {
      if ((x == 1 || x == 5) || // H
          (x > 6 && x < 12) || // E
          (x > 12 && x < 18) || // L
          (x > 18 && x < 24) || // L
          (x > 24 && x < 30) || // O
          (x == 32 || x == 33 || x == 35 || x == 36) || // W
          (x > 37 && x < 43) || // O
          (x == 44 || x == 47 || x == 48) || // R
          (x > 49 && x < 55) || // L
          (x > 55 && x < 60))// D
        out.print("* ");
      else
        out.print("  ");
    }
  }
}
