package InterviewPreparationKit.WarmUpChallenges;

public class JumpingOnClouds {

    public static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        int n = c.length;
        while( i < n-1){
            System.out.println("i: "+i);
            if(i+2< n && c[i+2] == 0){
                jumps++;
                i+=2;
            }else if (c[i+1] == 0){
                jumps++;
                i++;
                System.out.println("case2: "+ i +" "+ jumps);
            }else{
                jumps = 0;
            }
        }
        System.out.println(jumps);
        return jumps;
    }

    public static void main(String[] args) {
        int[] arrTest= new int[] {0, 0, 0, 1, 0, 0};
        jumpingOnClouds( arrTest);
    }
}
