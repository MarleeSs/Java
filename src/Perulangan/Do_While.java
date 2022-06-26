package Perulangan;

import static java.lang.System.out;

/*
# Algoritmik

mulai
tampilkan "Awal Program"
a = 0
kondisi true
lakukan variable a dengan ditambahkan 1
lalu tampilkan "Algoritma" ditambahkan variable a
jika a tepat dari 5
maka kondisi a menjadi false
ketika koindisinya true, maka akan terus berulang
ketika kondisinya false, maka tampilkan "Akhir dari program"
 */
public class Do_While {
  public static void main(String[] args) {

    out.println("Awal program");

    int a = 0;
    boolean kondisi = true;

    do {
      a++;

      out.println("Algoritma " + a);

      if (a == 5) {

        kondisi = false;

      }
    } while (kondisi);

    out.println("Akhir program");

  }
}
