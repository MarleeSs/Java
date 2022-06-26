package Operator;

import static java.lang.System.out;

public class Unary {

    public static void main(String[] args) {

        // unary = oprasi yang dilakukan pada satu variable

        // unary decrement dan increment
        int a, b;
        int c = 10;

        a = c;
        a++;

        b = c;
        b--;

        out.println(c);
        out.printf("++ >> %d\n", a);
        out.printf("-- >> %d\n", b);

        // unary boolean dengan (!) untuk negasi
        boolean ABC = true;

        out.printf("nilai ABC = %s ", !ABC);

    }
}
