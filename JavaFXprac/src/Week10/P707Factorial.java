/**
 *
 * @author Jason Heyer
 */
package Week10;

import java.util.Scanner;

public class P707Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter non-negative integer here: ");
        int n = input.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
        

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);

        }
    }
}
