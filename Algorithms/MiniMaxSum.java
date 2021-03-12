package Algorithms;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {

        long minSum = 0;
        long maxSum = 0;

        int j = 0;
        while ( j < arr.length) {
            long sum =0;
            int i= 0;
            while(i <arr.length){
               if(j !=i) sum += arr[i];
               i++;
            }

             if( (minSum > sum && sum > 0 )|| minSum == 0 ) minSum = sum;
             if( maxSum < sum ) maxSum = sum;
             j++;
        }
        System.out.println("Min sum: "+ minSum +" & Max sum: "+ maxSum);

    }

    public static void main(String[] args) {
        int[] test= new int[]{426980153, 354802167, 142980735, 968217435, 734892650};
        miniMaxSum(test);
    }
}
