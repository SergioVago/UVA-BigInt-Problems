
import java.math.BigInteger;
import java.util.Scanner;

/*
 * A software developed by
 * Sergio Vago R. de Melo
 * Know:
 * SR Tech - A Computer Store (srvix.com.br)
 * Unkode - A Developer Company (unkode.com.br)
 */
/**
 *
 * @author Sergio
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String number = in.next();
            int base = in.nextInt();
            int baseTo = in.nextInt();

            BigInteger bigNumber = new BigInteger(number, base);
            String outNumber = bigNumber.toString(baseTo).toUpperCase();

            int tam = outNumber.length();
            if (tam > 7) {
                System.out.println("  ERROR");
            } else {
                while (tam < 7) {
                    System.out.print(" ");
                    tam++;
                }
                System.out.println(outNumber);
            }
        }
    }
}
