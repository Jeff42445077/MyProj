// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public static char getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }

    static int lowest_to_change_arrow_direction(String my_string)
    {
        int string_length = my_string.length();
        char up = '^';
        char down = 'v';
        char left = '<';
        char right = '>';

        int up_count = 0;
        int down_count = 0;
        int left_count = 0;
        int right_count = 0;
        for(int i = 0; i<string_length;i++)
        {
            int index = i;
            char ch = getCharFromString(my_string, index);
            if (ch == up)
            {
                up_count = up_count + 1;
            }
            else if (ch == down)
            {
                down_count = down_count + 1;
            }
            else if (ch == left)
            {
                left_count = left_count + 1;
            }
            else if (ch == right)
            {
                right_count = right_count+1;
            }
            else
            {
                // do nothing
            }
        }
        int[] directions ={up_count,down_count,left_count,right_count};
        int maximum_index = 0;
        int maximum = 0;
        int lowet_sum = 0;
        for(int j = 0; j < 4; j++)
        {
            if(directions[j]>maximum)
            {
                maximum = directions[j];
                maximum_index = j;
            }
        }

        for(int x = 0; x < 4; x++)
        {
            if(maximum_index != x)
            {
                lowet_sum = lowet_sum + directions[x];
            }
        }
        return  lowet_sum;
    }


    public int solution(String S) {
        String my_string = S;
        int lowest = lowest_to_change_arrow_direction(my_string);
        return (lowest);


    }
}
