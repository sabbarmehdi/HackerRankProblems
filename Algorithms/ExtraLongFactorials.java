package Algorithms;

import java.math.BigInteger;

public class ExtraLongFactorials {


    /**
     * The factorial of the integer n, written n!, is defined as:
     * n! = n(n-1) * (n-2) * ...* 2 * 1
     * @param n
     */
    static void extraLongFactorial(int n) {
        BigInteger factorial = new BigInteger("1");
        int i =n;
        while(i > 1){
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i--;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        int x = 15;
        extraLongFactorial(x);
    }
}
