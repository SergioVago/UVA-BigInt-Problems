
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

    static int base1;
    static int base2;
    static boolean tem = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();

            compara(a, b);

            if (Main.tem) {
                System.out.println(a + " (base " + Main.base1 + ") = "
                        + b + " (base " + Main.base2 + ")");
            } else {
                System.out.println(a + " is not equal to " + b + " in any base 2..36");
            }

            Main.tem = false;
        }
    }

    public static void compara(String a, String b) {
        for (int i = 2; i < 37; i++) {
            try {
                BigInteger convA = new BigInteger(a, i);
                for (int j = 2; j < 37; j++) {
                    try {
                        BigInteger convB = new BigInteger(b, j);
                        if (convA.compareTo(convB) == 0) {
                            Main.base1 = i;
                            Main.base2 = j;
                            Main.tem = true;

                            return;
                        }
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}
