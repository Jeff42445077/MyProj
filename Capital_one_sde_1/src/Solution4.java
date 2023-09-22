import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;
import static java.lang.Integer.signum;

public class Solution4 {

    public int moves(int[] heights){

        int i = 0;
        int a = 0;

        if (heights.length ==2){
            Arrays.sort(heights);
            return (heights[1]-heights[0]);
        }

        else if (heights.length > 2){
            for (int j = 0; j <= heights.length; j++){
                a = signum(heights[j+1]-heights[j]);
                if (a != 1){
                    return a+1;
                }
            }
        }

        else return a;
        return a;
    }
}
