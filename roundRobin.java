import java.util.Scanner;

/*
 * arrivalTimeList is the list representing the arrival time of the tasks.
runTimeList is the list representing the run time of the tasks.
timeSlot is the fixed amount of time required by the round robin scheduling process.
 */
public class Solution {
    public static float waitingTimeRR(int[] arrivalTimeList, int[] runTimeList, int timeSlot) {
        float answer = 0;
        // Write your code here
        int numTasks = arrivalTimeList.length;
        int[] remainingTime = new int[numTasks];
        int[] waitingTime = new int[numTasks];
        int currentTime = 0;
        int completedTasks = 0;

        // Initialize remainingTime array with run times
        for (int i = 0; i < numTasks; i++) {
            remainingTime[i] = runTimeList[i];
        }

        while (completedTasks < numTasks) {
            boolean done = true;
            for (int i = 0; i < numTasks; i++) {
                if (arrivalTimeList[i] <= currentTime && remainingTime[i] > 0) {
                    int executeTime = Math.min(remainingTime[i], timeSlot);
                    remainingTime[i] -= executeTime;
                    currentTime += executeTime;

                    if (remainingTime[i] == 0) {
                        completedTasks++;
                        waitingTime[i] = currentTime - arrivalTimeList[i] - runTimeList[i];
                    }
                    done = false;
                }
            }
            if (done) {
                currentTime++;
            }
        }

        // Calculate the average waiting time
        for (int i = 0; i < numTasks; i++) {
            answer += waitingTime[i];
        }
        answer /= numTasks;

        answer = Float.parseFloat(String.format("%.2f", answer));

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input for arrivalTimeList
        int arrivalTimeList_size = in.nextInt();
        int arrivalTimeList[] = new int[arrivalTimeList_size];
        for (int idx = 0; idx < arrivalTimeList_size; idx++) {
            arrivalTimeList[idx] = in.nextInt();
        }
        // input for runTimeList
        int runTimeList_size = in.nextInt();
        int runTimeList[] = new int[runTimeList_size];
        for (int idx = 0; idx < runTimeList_size; idx++) {
            runTimeList[idx] = in.nextInt();
        }
        // input for timeSlot
        int timeSlot = in.nextInt();

        float result = waitingTimeRR(arrivalTimeList, runTimeList, timeSlot);

        System.out.printf("%.2f", result);
    }
}
