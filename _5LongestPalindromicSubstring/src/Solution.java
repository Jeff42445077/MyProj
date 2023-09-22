import java.util.Arrays;
import java.util.Objects;

class Solution {
    public String longestPalindrome(String s) {
        //detect string abcba in the string.

        int max=0;
        String answer="";

        if (s.length() < 1) return "";
        if (s.length()<2) return s;

        for(int i = 0; i < s.length(); i++){

            if(i != 0 && s.charAt(i) == s.charAt(i-1)){
                int cur = fun(i-2,i+1,s)+2;
                if(max<cur){
                    max = cur;
                    answer = s.substring(i-cur/2,i+cur/2);
                }
            }
            int cur = fun(i-1,i+1,s)+1;
            if(max<cur){
                max = cur;
                answer = s.substring(i-cur/2,i+1+cur/2);
            }
        }
        return answer;
    }
    private int fun(int l, int r, String s){
        if(l<0 || r>=s.length() || s.charAt(l)!=s.charAt(r)) return 0;
        return 2+fun(l-1,r+1,s);
    }

}