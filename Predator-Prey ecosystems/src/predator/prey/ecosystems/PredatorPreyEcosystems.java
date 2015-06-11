/*
 ONLINE TEST CODE
 https://codeboard.io/projects/3540
 http://ideone.com/s5Dhha
 */
package predator.prey.ecosystems;

/**
 * Class to calculate The Lotka-Volterra model is defined by the following
 * formula: H[n+1] = H[n] + a1 * H[n] - a2*H[n]*L[n] = H[n] * (1 + a1 - a2 *
 * L[n]) L[n+1] = L[n] - b1 * L[n] + b2*H[n]*L[n] = L[n] * (1 - b1 + b2 * H[n])
 *
 * @author Jose M
 * @version 1.0 05/21/15
 */
public class PredatorPreyEcosystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* initial population of snowshoe hares is 300
         initial population of lynxes is 20,
         values of the constants that regulate the model
         a1 = 0.1,                                               // if this variables are constant why not LOCAL variables in mehod.
         a2 = 0.01,
         b1 = 0.01 and
         b2 = 0.00002.
         */

        // definition of VAR.
        double[] preyPred;
        int n;

        preyPred = new double[2];

        // definition of CON.
        double[] a;
        double[] b;

        a = new double[2];
        b = new double[2];

        // initialize CON.
        a[0] = 0.1;
        a[1] = 0.01;
        b[0] = 0.01;
        b[1] = 0.00002;

        // initialize VAR.
        preyPred[0] = 300;
        preyPred[1] = 20;
        n = 5000;

        // call static methods with n = 5000 searching LYNX extinction.
        double[] preyPredLV = preyPredLV(preyPred, a, b, n);
        // printResult(preyPredLV,n);   //no print. using IF in method -> 1 iteration
    }

    /**
     * Calculate the populations of Hare and Lynx in a number of periods using
     * the Lotka-Volterra model.
     *
     * @param preyPred an array with 2 doubles. Initial population of snowshoe
     * hares, preyPred[0] and initial population of lynx, preyPred[1].
     * @param a an array with 2 doubles containing the constants a[0] = a1 and
     * a[1] = a2.
     * @param b an array with 2 doubles containing the constants b[0] = b1 and
     * b[1] = b2.
     * @param n the number of periods, which we want to predict the future
     * population of snowshoe hares and lynxes.
     * @return preyPred an array with the population of snowshoe hares in
     * preyPred[0] and lynxes preyPred[1].
     */
    static double[] preyPredLV(double[] preyPred, double[] a, double[] b, int n) {

        // Initialize local variables.
        double lynx;                                            // Calc var.
        double hare;                                            // Calc var.
        int i = 1;                                              // Variable to iterate
        boolean imp = false;                                    // Bool variable to print only one time.

        while (i <= n) {

            // Calculate population
            hare = preyPred[0] * (1 + a[0] - a[1] * preyPred[1]);
            lynx = preyPred[1] * (1 - b[0] + b[1] * preyPred[0]);

            // Swap Local variables to Array
            preyPred[0] = hare;
            preyPred[1] = lynx;

            // Sample test
            if (i == 1) {
                printResult(preyPred, i);     //  1   period  -> OK
            }
            if (i == 2) {
                printResult(preyPred, i);     //  2   period  -> OK
            }
            if (i == 20) {
                printResult(preyPred, i);     //  20  periods -> OK
            }
            if (i == 100) {
                printResult(preyPred, i);     //  100 periods -> OK
            }
            if (i == 200) {
                printResult(preyPred, i);     //  200 periods -> OK
            }
            // Last LYNX dead -> EXTINCT
            if ((lynx < 0 || hare < 0) && imp == false) {// ONLY FOR COMPARE 3 LOGICAL ARGUMENTS. hare not NECESSARY.
                System.out.println();
                System.out.println("El Lince se extinguio entre el periodo " + (i - 1) + " y el " + i + ".");
                System.out.println();
                imp = true;
                break; 
            }
            // Increase i
            i++;
        }
        return preyPred;
    }

    /**
     * Print format data.
     *
     * @param preyPred an array with 2 doubles. Population of snowshoe hares,
     * preyPred[0] and population of lynx, preyPred[1].
     * @param n the number of periods calculated.
     */
    static void printResult(double[] preyPred, int n) {
        // Print results formated
        System.out.println("------------------------------------------");
        System.out.format("After %d periods, the population will be:%n", n);
        System.out.format("H[%d] = %.3f snowshoe hares%n", n, preyPred[0]);
        System.out.format("L[%d] = %.3f lynxes%n", n, preyPred[1]);
        System.out.println("------------------------------------------");
    }
}
