import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * There is a collection of input strings and a collection of query strings. 
 * For each query string, determine how many times it occurs in the list of input strings. 
 * Return an array of the results.

Example:
    strings = ["ab","ab","abc"]
    queries = ["ab","abc","bc"]


  * There are 2 instances of 'ab', 1 of 'abc' and 0 of 'bc'. 
  * For each query, add an element to the return array, 
  * results = [2,1,0] 
 */

class Result3 {
    
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */
    
    
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
     // Write your code here
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for(String q : queries){
            for(String s : strings){
               if(q.equals(s)){
                   i++;
               } 
            }
            list.add(i);
            i = 0;
        }
        return list;
    }

    public class SparseArrays {

    }
    
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                .collect(toList());

            int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                .collect(toList());

            List<Integer> res = Result3.matchingStrings(strings, queries);

            bufferedWriter.write(
                res.stream()
                    .map(Object::toString)
                    .collect(joining("\n"))
                + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }

    }


