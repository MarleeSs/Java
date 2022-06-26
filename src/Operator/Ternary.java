package Operator;

import static java.lang.System.*;
import java.util.*;

public class Ternary {
    public static void main(String[] args) {
        int input, a;

        out.print("Jumlah: ");
        try (Scanner inputUser = new Scanner(in)) {
            input = inputUser.nextInt();
        }
        a = (input <= 100) ? (input - 100) : (input * 2);

        out.printf("Hasil = %d", a);
    }
}
