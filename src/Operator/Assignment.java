package Operator;

import static java.lang.System.out;

public class Assignment {

    public static void main(String[] args) {

        int a = 20;
        a += 15;

        int b = 20;
        b -= 15;

        int c = 20;
        c *= 15;

        int d = 20;
        d /= 15;

        int e = 20;
        e %= 11;

        out.printf("a += b -> %d", a);
        out.printf("\na -= b -> %d", b);
        out.printf("\na *= b -> %d", c);
        out.printf("\na /= b -> %d", d);
        out.printf("\na %%= b -> %d", e);
    }

}
