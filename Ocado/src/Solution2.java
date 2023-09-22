//MicroSoft particle velocity
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution2 {
    public static int velocity(int[] A){
        int total = 0, A_size=A.length;
        for (int i =0; i<A_size; i++){
            for (int count =0; i+2<A_size && A[i+1]-A[i]==A[i+2]-A[i+1]; i++){
                count ++;
                total += count;


            }
        }
        return total<1000000000 ? total : -1;
    }

    public int solution(int[] A) {
        // Implement your solution here
        return velocity(A);
    }
}
