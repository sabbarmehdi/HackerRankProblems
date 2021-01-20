package InterviewPreparationKit.WarmUpChallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SalesByMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int numberOfPairs = 0;
        if (ar.length == 0) return numberOfPairs;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            if (!set.contains(ar[i])) {
                set.add(ar[i]);
            } else {
                numberOfPairs++;
                set.remove(ar[i]);
            }
        }
        System.out.println(numberOfPairs);
        return numberOfPairs;
    }
    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arrTest= new int[] {4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6 ,3, 6, 1, 4, 5, 5, 5};
        sockMerchant(20, arrTest);
        //       6,  4,
    }
}
