
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();

        while (b != 0) {
            BigInteger p = new BigInteger(in.next(), b);
            BigInteger m = new BigInteger(in.next(), b);
            BigInteger result = p.mod(m);
            String saida = result.toString(b);

            System.out.println(saida);
            b = in.nextInt();
        }
    }

}
