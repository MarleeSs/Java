package Operator;

import static java.lang.System.out;

public class Aritmatika {

  public static void main(String[] args) {
    int hasilT, hasilK, hasilDK, hasilB, hasilBM;
    int a = 10;
    int b = 9;

    // Pertambahan
    hasilT = a + b;

    // Pengurangan
    hasilK = a - b;

    // Perkalian
    hasilDK = a * b;

    // Pembagian
    hasilB = a / b;

    // Modulus (Sisa bagi)
    hasilBM = a % b;

    out.printf("%d+%d = %d \n", a, b, hasilT);
    out.printf("%d-%d = %d \n", a, b, hasilK);
    out.printf("%d*%d = %d \n", a, b, hasilDK);
    out.printf("%d/%d = %d \n", a, b, hasilB);
    out.printf("%d%%%d = %d \n", a, b, hasilBM);
  }
}
