package Perulangan;

import static java.lang.System.out;

/*
# Algoritmik
mulai
untuk a sama dengan 1
kemudian a ditambahkan lagi dengan variable a
bila a masih kurang dari sama dengan 5
tampilkan "Algoritma" tambahkan variable a
selesai
 */
public class For {
  public static void main(String[] args) {

    out.println("Mulai");

    for (int a = 1; a <= 5; a++) {

      out.println("Algoritma " + a);

    }

    out.println("Selesai");

  }
}
