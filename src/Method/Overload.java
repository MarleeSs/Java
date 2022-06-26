package Method;

public class Overload {
  public static void main(String[] args) {
    printAngka(10.2f);
    printAngka(10);
  }

  private static void printAngka(float angkaFloat) {
    System.out.println(">> " + angkaFloat);
  }

  private static void printAngka(int angkaInteger) {
    System.out.println(">> " + angkaInteger);
  }
}
