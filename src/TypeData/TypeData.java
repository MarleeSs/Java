package TypeData;
import static java.lang.System.out;

public class TypeData {
    public static void main(String[] args) {
        // int, byte, short, long, double, float, char, boolean
        // adalah type data primitive

        // integer (satuan)
        int i = 10;
        out.println("\n=============== Integer ===============\n");
        out.println("nilai integer i = " + (i));
        out.println("nilai Max = " + Integer.MAX_VALUE);
        out.println("nilai Max = " + Integer.MIN_VALUE);
        out.println("besar nilai integer = " + Integer.BYTES + "Bytes");
        out.println("besar nilai integer = " + Integer.SIZE + "Bit");

        // byte (satuan)
        byte b = 10;
        out.println("\n=============== Byte ===============\n");
        out.println("nilai byte b = " + (b));
        out.println("nilai Max = " + Byte.MAX_VALUE);
        out.println("nilai Min = " + Byte.MIN_VALUE);
        out.println("besar nilai byte = " + Byte.BYTES + "Bytes");
        out.println("besar nilai byte = " + Byte.SIZE + "Bit");

        // short (satuan)
        short s = 10;
        out.println("\n=============== Short ===============\n");
        out.println("nilai Short s = " + (s));
        out.println("nilai Max = " + Short.MAX_VALUE);
        out.println("nilai Max = " + Short.MIN_VALUE);
        out.println("besar nilai Short = " + Short.BYTES + "Bytes");
        out.println("besar nilai Short = " + Short.SIZE + "Bit");

        // long (satuan)
        long l = 10L;
        out.println("\n=============== Long ===============\n");
        out.println("nilai Long l = " + (l));
        out.println("nilai Max = " + Long.MAX_VALUE);
        out.println("nilai Max = " + Long.MIN_VALUE);
        out.println("besar nilai long = " + Long.BYTES + "Bytes");
        out.println("besar nilai long = " + Long.SIZE + "Bit");

        // double (koma, bilangan real)
        double d = 10.5d;
        out.println("\n=============== Double ===============\n");
        out.println("nilai double l = " + (d));
        out.println("nilai Max = " + Double.MAX_VALUE);
        out.println("nilai Max = " + Double.MIN_VALUE);
        out.println("besar nilai double = " + Double.BYTES + "Bytes");
        out.println("besar nilai double = " + Double.SIZE + "Bit");

        // float (koma, bilangan real)
        float f = 10.2f;
        out.println("\n=============== Float ===============\n");
        out.println("nilai float f = " + (f));
        out.println("nilai Max = " + Float.MAX_VALUE);
        out.println("nilai Max = " + Float.MIN_VALUE);
        out.println("besar nilai float = " + Float.BYTES + "Bytes");
        out.println("besar nilai float = " + Float.SIZE + "Bit");

        // char (character) Berdasarkan ASCII
        char c = 'a';
        out.println("\n=============== Character ===============\n");
        out.println("nilai char c = " + (c));
        out.println("nilai Max = " + Character.MAX_VALUE);
        out.println("nilai Max = " + Character.MIN_VALUE);
        out.println("besar nilai char = " + Character.BYTES + "Bytes");
        out.println("besar nilai char = " + Character.SIZE + "Bit");

        // boolean (nilai true atau false)
        boolean val = false;
        out.println("\n=============== Boolean ===============\n");
        out.println("nilai boolean = " + (val));
        out.println("nilai Max = " + Boolean.FALSE);
        out.println("nilai Max = " + Boolean.TRUE);
    }
}
