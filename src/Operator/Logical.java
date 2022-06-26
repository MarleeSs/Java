package Operator;

import static java.lang.System.out;

public class Logical {
    public static void main(String[] args) {

        // NOT,AND,OR,XOR
        boolean notT, notF;
        boolean andT, andF, andTF, andFT;
        boolean orT, orF, orTF, orFT;
        boolean xorT, xorF, xorTF, xorFT;
        boolean a, b;

        a = true;
        b = false;

        // NOT(!)
        notT = !a;
        notF = !b;

        // AND (&)
        andT = a && a;
        andTF = a && b;
        andF = b && b;
        andFT = b && a;

        // OR (||)
        orT = a || a;
        orTF = a || b;
        orF = b || b;
        orFT = b || a;

        // XOR (^)
        xorT = a ^ a;
        xorTF = a ^ b;
        xorF = b ^ b;
        xorFT = b ^ a;

        out.printf("~NOT~\n!%s  --> %s\n!%s --> %s", a, notT, b, notF);
        out.printf("\n~AND~\n%s && %s   --> %s\n%s && %s  --> %s\n%s && %s --> %s\n%s && %s  --> %s", a, a, andT, a, b,
                andTF, b, b, andF, b, a, andFT);
        out.printf("\n~OR~\n%s || %s   --> %s\n%s || %s  --> %s\n%s || %s --> %s\n%s || %s  --> %s", a, a, orT, a, b,
                orTF, b, b, orF, b, a, orFT);
        out.printf("\n~XOR~\n%s ^ %s   --> %s\n%s ^ %s  --> %s\n%s ^ %s --> %s\n%s ^ %s  --> %s", a, a, xorT, a, b,
                xorTF, b, b, xorF, b, a, xorFT);

    }
}
