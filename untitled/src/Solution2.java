public class Solution2 {
    int solution(int[] numbers) {

        int x ;
        int ans = 0 ;

        for (int i =0;i < numbers.length; i++){

            while (numbers[i] != 0) {

                numbers[i]= numbers[i]-numbers[1];

                if (numbers[i] < numbers[1]){
                    ans = ans + numbers[i] + numbers[1];
                } else if (numbers[i] >= numbers[1]){
                    ans = ans + numbers[i] - numbers[1];
                }

            }

        }
    }
}
