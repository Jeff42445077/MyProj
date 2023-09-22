//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//class Solution {
//    public int myAtoi(String s) {
//
//        String[] a = s.split("");
//        int ans = 0, temp, i, j = 0;
//
//
//
//        List<String> list = new ArrayList<String>(Arrays.asList(a));
//        list.removeIf(x -> x.contains(" "));
//
//        if (!(a[0].contains("0") || a[0].contains("1") || a[0].contains("2") || a[0].contains("3") || a[0].contains("4") || a[0].contains("5") || a[0].contains("6") || a[0].contains("7") || a[0].contains("8") || a[0].contains("9") || a[0].contains("-") )){return 0;}
//
//        list.removeIf(x -> !(x.contains("-") ||x.contains("1") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6") ||x.contains("7") || x.contains("8") || x.contains("9") || x.contains("0") ) );
//
//        a = list.toArray(new String[0]);
//
//
//        if (Objects.equals(a[0],null)){return 0;}
//
//        else if (Objects.equals(a[0], "-")){
//            list.remove("-");
//            a = list.toArray(new String[0]);
//            int[] numbers = new int[a.length];
//            for(i = 0;i < a.length;i++) {
//                numbers[i] = Integer.parseInt(a[i]);
//            }
//
//            while (j<a.length) {
//
//                temp = (int) (numbers[j] * Math.pow(10, a.length-j-1));
//                ans = ans + temp;
//                j++;
//
//            }
//
//            ans = -ans;
//            return ans;
//        }else{
//            a = list.toArray(new String[0]);
//            int[] numbers = new int[a.length];
//            for(i = 0;i < a.length;i++) {
//                numbers[i] = Integer.parseInt(a[i]);
//            }
//
//            while (j<a.length) {
//
//                temp = (int) (numbers[j] * Math.pow(10, a.length-j-1));
//                ans = ans + temp;
//                j++;
//
//            }
//
//            return ans;
//
//
//
//
//        }
//    }
//}

public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }

        char[] letters = str.toCharArray();

        long result = 0;

        boolean isNegative = false;
        // The following boolean symbolEncountered will handle inputs like "--2891" or "-+189"
        boolean symbolEncountered = false;
        boolean numbersStarted = false;
        for(int i = 0 ; i < letters.length ; ++i) {
            char c = letters[i];

            if(!Character.isDigit(c)) {
                if(numbersStarted) {
                    break;
                }

                if (c == '-') {
                    if(symbolEncountered) {
                        return 0;
                    }
                    isNegative = true;
                    numbersStarted = true;
                    symbolEncountered = true;
                    continue;
                }
                if (c == '+') {
                    if(symbolEncountered) {
                        return 0;
                    }
                    numbersStarted = true;
                    symbolEncountered = true;
                    continue;
                }
                if(c == ' ') {
                    if(!numbersStarted) {
                        continue;
                    }
                }

                return 0;
            }

            numbersStarted = true;
            int numLetter = Character.getNumericValue(c);
            result = result * 10 + numLetter;

            if(isNegative && result > Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }

            if(result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        if(isNegative) {
            result = result * -1;
        }

        return (int)result;
    }
}