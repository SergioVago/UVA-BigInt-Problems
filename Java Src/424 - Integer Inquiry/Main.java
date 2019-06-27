
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
        BigInteger sum = new BigInteger("0");

        String val = in.next();
        while (!val.equals("0")) {
            BigInteger bigVal = new BigInteger(val);
            sum = sum.add(bigVal);

            val = in.next();
        }

        System.out.println(sum);
    }

}
