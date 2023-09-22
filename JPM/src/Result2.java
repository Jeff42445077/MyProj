import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result2 {

    /*
     * Complete the 'kthOccurrence' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER X
     *  2. INTEGER_ARRAY arr
     *  3. INTEGER_ARRAY query_values
     */

    public static List<Integer> kthOccurrence(int X, List<Integer> arr, List<Integer> query_values) {
        // Write your code here
        //search for x
        int flag = 0;
        int a = 0;
        List<Integer> L = null;
        for (int i =0; i <arr.size(); i++){

            for (int j =0; j< arr.size(); j++){
                if (arr.get(j) == X){
                    flag +=1;
                    if (flag == query_values.get(i)){
                        a = arr.get(j);
                    }
                    if (arr.get(query_values.get(i)) == X || query_values.get(i) > arr.size()){
                        a = -1;
                    }
                }
            }
            L.add(a);
        }
        return L;
    }

}