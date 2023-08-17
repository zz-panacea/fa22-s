/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Returns the nextNumber in a Collatz sequence. */
    public static int nextNumber(int n) {
        // TODO: Fill in this method.
        if (n % 2 == 0 && n != 1) {
            return n/2;
        } else if ((n % 2 == 1 && n != 1)){
            return 3 * n + 1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");

        // Some starter code to test
        while (n != 1) {          
            n = nextNumber(n);          
            System.out.print(n + " ");
        }
        System.out.println();

    }
}

