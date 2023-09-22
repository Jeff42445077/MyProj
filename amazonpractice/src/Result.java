import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'groupSort' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<List<Integer>> groupSort(List<Integer> arr) {
        // Write your code here
        int[][] ans = new int[0][];
        List<List<Integer>> list = Collections.singletonList(new ArrayList<Integer>());
        boolean visited[] = new boolean[arr.get(0)];
        Arrays.fill(visited, false);
        for (int i = 1; i < arr.size(); i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    visited[j] = true;
                    count++;
                }
                ans = new int[][]{{arr.get(i), count}};
            }
            final int N = arr.size();
            ans = Arrays.copyOf(ans, N + 1);
            ans[N] = new int[]{arr.get(i), count};
            for (List<Integer> array : list) {
                list.addAll(Arrays.asList(array));
                return list;
            }

            return null;
        }
        return list;
    }
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<List<Integer>> result = Result.groupSort(arr);

        result.stream()
                .map(
                        r -> r.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
