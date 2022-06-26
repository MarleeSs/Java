package Perulangan;

import static java.lang.System.out;

/*
 # Algoritmik

 mulai Loop
 awal = 1
 bila a kurang dari 5
 tampilkan "Algoritma" dengan tambahankan variable a
 bila variable a masih kurang dari 5, variable a ditambahkan lagi dengan variable a
 ketika variable a sudah mencapai targetnya yaitu kurang dari samadengan 5
 tampilkan "Loop Selesai"
 loop selesai
 */
public class While {

  public static void main(String[] args) {

    out.println("Mulai Loop");

    int a = 1;
    while (a <= 5) {

      out.println("Algoritma " + a);

      a++;
    }

    out.println("Loop Selesai");

  }
}
