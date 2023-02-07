import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/*
 * Given an array of integers, where all elements but one occur twice, 
 * find the unique element.
 * Example 
 * a = [1,2,3,4,3,2,1];
 * The unique element is 4
 * Function Description
 * Complete the lonelyinteger function in the editor below.
 * 
 * lonelyinteger has the following parameter(s):
 * int a[n]: an array of integers
 * Returns
 * int: the element that occurs only once
 */

class Result4 {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i : a){
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }
        Integer result=0;
        Integer temp = 1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(temp.equals(entry.getValue())){
                result = (Integer)entry.getKey();
                System.out.println(result);
            }
        }
        return result;
    }
}

public class LonelyInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result4.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

 

}
