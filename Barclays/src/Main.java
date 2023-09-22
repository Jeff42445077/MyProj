import java.util.*;
import java.lang.*;
import java.io.*;

/*
 *
 */
public class Solution
{
    public static int[]  streetLight(int[] currentState, int days)
    {
        int[]  answer = new int[100];
        // Write your code here
        int i,j;
        for(i=0;i<days;i++){
            currentState[-1]=0;
            currentState[8]=0;
            for( i=-1;i<9;i++){
                answer[i]=currentState[i];
            }
            for(j=0;j<8;j++){
                if(answer[j-1]==answer[j+1]){
                    currentState[j]=0;
                }
                else{
                    currentState[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for currentState
        int currentState_size = in.nextInt();
        int currentState[] = new int[currentState_size];
        for(int idx = 0; idx < currentState_size; idx++)
        {
            currentState[idx] = in.nextInt();
        }
        // input for days
        int days = in.nextInt();


        int[] result = streetLight(currentState, days);
        for(int idx = 0; idx < result.length - 1; idx++)
        {
            System.out.print(result[idx] + " ");
        }
        System.out.print(result[result.length - 1]);
    }
}
