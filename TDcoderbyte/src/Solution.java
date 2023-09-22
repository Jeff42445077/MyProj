import java.util.Scanner;

public class Solution {
    public static int MathChallenge(int num1, int num2) {
        // code goes here
        if (num2>num1){
            return 1;
        }
        else if (num2<num1) {
            return 0;
        }
        else return -1;
    }

    public static void main (String[] args) {
        // keep this function call here

        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(s.nextLine()));
    }

}