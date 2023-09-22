import java.util.Scanner;

class Solution {
    public int reverse(int x) {

        int num = 0;
        int reversenum = 0;
        Scanner in = new Scanner(String.valueOf(x));
        num = x;
        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        if (x > -2147483648 && x < 2147483647 && reversenum > -2147483648 && reversenum < 2147483647 ) {
            return reversenum;

        }else return 0;
    }
}
