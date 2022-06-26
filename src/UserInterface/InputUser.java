package UserInterface;

import static java.lang.System.*;
import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {

        try (Scanner inputUser = new Scanner(in)) {
            out.print(">> ");
            int input = inputUser.nextInt();

            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= i; j++) {

                    String bit_j = String.format("%8s", Integer.toBinaryString(j)).replace(' ', '0');

                    out.print(bit_j + " ");

                }

                out.println();

            }
        }
    }
}
