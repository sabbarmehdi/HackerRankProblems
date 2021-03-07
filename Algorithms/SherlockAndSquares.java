package Algorithms;

public class SherlockAndSquares {
   /* Watson likes to challenge Sherlock's math ability. He will provide a starting
    and ending value that describe a range of integers, inclusive of the endpoints.
    Sherlock must determine the number of square integers within that range.
    Note: A square integer is an integer which is the square of an integer, e.g.1, 4, 9, 16, 25.*/

    static int squares(int a, int b) {

        int numOfSqr =0;
        int i = (int)Math.sqrt(a);
        if(i*i != a) i++;

        while(i * i <= b){
            numOfSqr++;
            i++;
        }
        return numOfSqr;
    }

    public static void main(String[] args) {
        int a = 17, b= 24;
        squares(a,b);
    }
}
