package Operator;

import static java.lang.System.out;

public class Bitwise {
    public static void main(String[] args) {
        // oprator untuk melakukan pengoprasian pada nilai bit

        String bit_a, bit_b, bit_sR, bit_sL, bit_not, bit_and, bit_or, bit_xor;
        byte a, b, sR, sL, not, and, or, xor;
        a = 10;
        b = 3;

        bit_a = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');

        bit_b = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');

        // Shift left (<<)
        sR = (byte) (a << 1);
        bit_sR = String.format("%8s", Integer.toBinaryString(sR)).replace(' ', '0');

        // Shift right (>>)
        sL = (byte) (a >> 1);
        bit_sL = String.format("%8s", Integer.toBinaryString(sL)).replace(' ', '0');

        // bitwise logical //

        // Bitwise NOT(~)

        not = (byte) (~a);
        bit_not = String.format("%8s", Integer.toBinaryString(not)).substring(24);

        // Bitwise AND(&)
        and = (byte) (a & b);
        bit_and = String.format("%8s", Integer.toBinaryString(and)).replace(' ', '0');

        // Bitwise OR(|)
        or = (byte) (a | b);
        bit_or = String.format("%8s", Integer.toBinaryString(or)).replace(' ', '0');

        // Bitwise OR(^)
        xor = (byte) (a ^ b);
        bit_xor = String.format("%8s", Integer.toBinaryString(xor)).replace(' ', '0');

        out.printf("%s = %d\n", bit_a, a);
        out.printf("\n<<~%s = %d\n", bit_sR, sR);
        out.printf("\n~>>%s = %d\n", bit_sL, sL);
        out.printf("~\n\n%s = %d\n--------NOT\n%s = %d\n\n", bit_a, a, bit_not, not);
        out.printf("~\n\n%s = %d\n%s = %d\n--------AND\n%s = %s\n\n", bit_a, a, bit_b, b, bit_and, and);
        out.printf("~\n\n%s = %d\n%s = %d\n--------OR\n%s = %s\n\n", bit_a, a, bit_b, b, bit_or, or);
        out.printf("~\n\n%s = %d\n%s = %d\n--------XOR\n%s = %s\n\n", bit_a, a, bit_b, b, bit_xor, xor);

    }
}
