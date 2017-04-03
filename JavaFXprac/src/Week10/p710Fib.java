/**
 *
 * @author Jason Heyer
 */
package Week10;

import java.util.Scanner;

public class p710Fib {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter non-negative integer here: ");
        int n = input.nextInt();

        System.out.println("The Fibonacci number at index " + n + " is " + fib(n));
    }

    public static long fib(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        }else{
            return fib(index-1)+ fib(index-2);
        }

    }
}
