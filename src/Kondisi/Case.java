package Kondisi;

import static java.lang.System.*;
import java.util.*;

public class Case {
  public static void main(String[] args) {
    out.println("~My Wallet Address~");
    out.print("^BEP2        ");
    out.print("^Bitcoin/BTC\n");
    out.print("^BSC/BEP20    ");
    out.print("^ERC20\n");
    out.println("^Solana    ");

    String input;
    try (Scanner inputUser = new Scanner(in)) {
      out.print(">>>");
      input = inputUser.next();
    }
    switch (input) {
      case "BEP2":
        out.println("bnb136ns6lfw4zs5hg4n85vdthaad7hq5m4gtkgf23");
        out.println("MEMO : 390813165");
        break;
      case "BEP20":
        out.println("0xb2bcd969b6b38e5c164187433d7779f01020365a");
        break;
      case "BTC":
        out.println("1HQEy5ZA3PGHdgW83mGPkKjf2Leu4oPE1H");
        break;
      case "SOL":
        out.println("9Xdgt8T6A8jX5y6HpbNAPuNUtTgoN6xdL6XERD278URk");
        break;
      case "ERC20":
        out.println("0xb2bcd969b6b38e5c164187433d7779f01020365a");
        break;
      default:
        out.println("Tidak ada disini");
    }
  }
}
