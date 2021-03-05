package Algorithms;

public class FindDigits {

    /*An integer d is a divisor of an integer n if the remainder of n % d = 0.
    Given an integer, for each digit that makes up the integer determine whether it
    is a divisor. Count the number of divisors occurring within the integer.*/
    /**
     * Complete the findDigits function below.
     * @param n
     * @return
     */
    static int findDigits(int n) {
        int d = 0;
        int i = n;
        while(i > 0){
            int div = i % 10;
            if( div != 0 ){
                if(n % div == 0 ){
                    d++;
                }
            }
            i /=10;
        }
        System.out.println(d);
        return d;
    }

    public static void main(String[] args) {
        int test = 120;
        findDigits(test);
    }
}
