
class Solution {
    public boolean isMatch(String s, String p) {

        String[] ss = s.split("");
        String[] pp = p.split("");

        if (s.length() != p.length()) {
            return false;
        }

        if (s.matches("[a-z]+") && p.matches("[a-z.*]+")) {

            for (int i=0; i < p.length()+1; i++) {
                if (pp[i].matches("[*]") && i>0){
                    pp[i]= p.substring(i-1,i);
                }
                }
            }

            for (int i = 1; i < s.length(); i++) {
                if (s.substring(i - 1, i) == p.substring(i - 1, i)) {
                    return true;
                }
            }

            return false;
        }
        return false;
    }
}