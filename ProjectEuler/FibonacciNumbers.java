package ProjectEuler;

import java.util.Scanner;

public class FibonacciNumbers {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long previousNumber = 1;
            long lastNumber = 2;
            long sum = 0;
            while(lastNumber <= n){
                if(lastNumber % 2 == 0) {
                    sum += lastNumber;
                }
                lastNumber += previousNumber;
                previousNumber = lastNumber - previousNumber;
            }
            System.out.println(sum);
        }
    }
}
