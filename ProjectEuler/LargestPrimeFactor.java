package ProjectEuler;

import java.util.Scanner;

public class LargestPrimeFactor{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            int prime = 2 ;
            for(int i=2; i<= n; i++){
                    while(n%i ==0){
                        n /=i;
                    }
                prime = i;
            }
            System.out.println(prime);
        }
    }
}
