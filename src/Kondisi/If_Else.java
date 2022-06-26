package Kondisi;

import static java.lang.System.*;
import java.util.*;

public class If_Else {
  public static void main(String[] args) {

    out.println("~~~ Welcome to BUGS GAME! ~~~");

    try (Scanner inputUser = new Scanner(in)) {
      out.print("Angka berapa yang lebih dari 1 ? \n>>>");
      int input = inputUser.nextInt();

      if (input > 1)
        out.println(input + "? \nAnda Salah");
      else
        out.println(input + "? \nAnda Benar!");
    }
  }
}
