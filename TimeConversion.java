import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Sample Input
 * 07:05:45PM
 * Sample Output
 * 19:05:45
 */

class Result2 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        int hours = Integer.parseInt(s.substring(0, 2));
        System.out.println(hours);
        if(s.charAt(s.length()-1) == 'A' && hours == 12){
            hours = 00;
        }
        if(s.charAt(s.length()-1) == 'P'){
            hours += 12;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(hours));
        sb.append(s.substring(2, s.length() - 2));
        System.out.println(sb);
        
        return sb.toString();
    }

}

public class TimeConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result2.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
