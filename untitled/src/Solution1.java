

public class Solution1 {
    boolean solution1(String s, String t) {

        if (s.length() == t.length()){
            for (int i = 1; i < s.length(); i++) {
                char nextChar = (char)((int)s.charAt(i)+1);


                if (t.charAt(i)==nextChar){

                        return true;
                }
                else return false;
            }

        }


        else return false;
        return false;
    }
}