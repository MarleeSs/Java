package Operator;

import static java.lang.System.out;

public class komparasi {
    public static void main(String[] args) {
        boolean hasilS, hasilTS, hasilK, hasilL, hasilKDS, hasilLDS;
        int a = 10;
        int b = 10;

        hasilS = (a == b);
        hasilTS = (a != b);
        hasilK = (a < b);
        hasilL = (a > b);
        hasilKDS = (a <= b);
        hasilLDS = (a >= b);

        out.printf("%d == %d --> %s", a, b, hasilS);
        out.printf("\n%d != %d --> %s", a, b, hasilTS);
        out.printf("\n%d < %d  --> %s", a, b, hasilK);
        out.printf("\n%d > %d  --> %s", a, b, hasilL);
        out.printf("\n%d <= %d --> %s", a, b, hasilKDS);
        out.printf("\n%d >= %d --> %s", a, b, hasilLDS);

    }
}
