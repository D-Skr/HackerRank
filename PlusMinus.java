import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

    public static void main(String[] args) throws IOException{
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
    

}

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float plus = 0;
    float zero = 0;
    float minus = 0;
    for(Integer i : arr){
        if(i > 0) {
            plus++;
            continue;
        } 
        if(i == 0){
            zero++;
            continue;
        } else {
            minus++;
            continue;
        }
    }
    plus /= arr.size();
    zero/= arr.size();
    minus /= arr.size();
    // double plusRatio = plus / arr.size();
    // double zeroRatio = zero / arr.size();
    // double minusRatio = minus / arr.size();
    // System.out.printf("%.6f %n", plusRatio);
    // System.out.printf("%.6f %n", zeroRatio);
    // System.out.printf("%.6f %n", minusRatio);
    // System.out.println(plus);
    // System.out.println(zero);
    // System.out.println(minus);
    System.out.printf("%.6f %n", plus);
    System.out.printf("%.6f %n", zero);
    System.out.printf("%.6f %n", minus);
    }

}
