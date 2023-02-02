import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

    //sample input
    //1 2 3 4 5
    
    //sample output
    // 10 14
class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long sum = arr.stream().mapToLong(i -> i).sum();
        long max = Collections.max(arr);
        long min = Collections.min(arr);
        System.out.print(sum - max);
        System.out.print(" ");
        System.out.print(sum - min);
    }

}

public class MiniMaxSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }

}
