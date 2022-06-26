package TypeData;
import static java.lang.System.out;

public class KonversiTypeData {

    public static void main(String[] args) {
        int nilaiInt = 650; // 32bit

        // memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;

        // memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;

        out.printf("Nilai integer = %d",nilaiInt);
        out.printf("\nNilai long = %d",nilaiLong);
        out.printf("\nNilai byte = %d",nilaiByte);

        // konversi pembagian
        int x,y;

        x = 11;
        y = 5;
        float z = (float)x / y;

        out.printf("\n%d / %d = %f",x,y,z);
    }
}
