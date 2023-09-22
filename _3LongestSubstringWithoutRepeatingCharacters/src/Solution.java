import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int length = 0;
        Map<Character, Integer> map = new HashMap<>();

        List<String> a = new ArrayList<>();
        String[] b = s.split("");
        int i = 0;
        if (s.length() > 0) {
            for (i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i)) && count < map.get(s.charAt(i))) {
                    count = map.get(s.charAt(i)) + 1;
                } else {
                    length = Math.max(length, i-count+1);
                }
                map.put(s.charAt(i), i);

                return length;
            }
        }
        return length;
    }
}