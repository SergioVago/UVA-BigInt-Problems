/*
 * A software developed by
 * Sergio Vago R. de Melo
 * Know:
 * SR Tech - A Computer Store (srvix.com.br)
 * Unkode - A Developer Company (unkode.com.br)
 */

import java.math.BigInteger;
import java.util.Scanner;

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

        while (in.hasNext()) {
            BigInteger numBase = new BigInteger("0");
            int illegal = 0;

            int base = in.nextInt();
            int baseTo = in.nextInt();
            String val = in.next();
            boolean pode = true;

            try {
                numBase = new BigInteger(val, base);
            } catch (Exception ex) {
                pode = false;
                illegal = base;
            }

            if (pode) {
                String var = numBase.toString(baseTo).toUpperCase();

                System.out.println(val + " base " + base + " = "
                        + var + " base " + baseTo);
            } else {
                System.out.println(val + " is an illegal base " + illegal + " number");

            }
        }
    }
}
