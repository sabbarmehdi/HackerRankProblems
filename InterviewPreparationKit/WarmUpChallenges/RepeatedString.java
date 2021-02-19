package InterviewPreparationKit.WarmUpChallenges;

import java.math.BigInteger;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long frequencyCount = 0;
        int sLength = s.length();
        long sMultiDiv = 0;


        if(sLength <= n){
            //Calculate repetition of 'a' in a single String s
            for (int i = 0; i < sLength; i++) {
                if (s.charAt(i) == 'a') {
                    frequencyCount++;
                }
            }
            //Find how much times should multiple the String s
            //to be in length of n
            long div = n / sLength;
            sMultiDiv = div * sLength;
            /*StringBuilder multipleString = new StringBuilder();

            //Multiple th String s by div and put them in on String
            for (long i =0; i < div; i++){
                multipleString.append(s);
            }*/
            //recalculate frequencyCount
            frequencyCount *= div;

            //If the length of the multiplied String stay smaller then n
            if(sMultiDiv % n != 0){
                //find how much characters we nee
                int difference = (int) (n - sMultiDiv);

                //Calculate repetition of 'a' in this rang of a single String s
                for (int i = 0; i < difference; i++) {
                    if (s.charAt(i) == 'a') {
                        frequencyCount++;
                    }
                }
            }

        }else if(sLength > n ){
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') {
                    frequencyCount++;
                }
            }
        }else {
            System.out.println("Unexpected input");
        }
        System.out.println(frequencyCount);
        return frequencyCount;
    }

    public static void main(String[] args) {
        String sTest = "ababa";
        long nTest = 3;
        repeatedString( sTest, nTest);
    }
}
