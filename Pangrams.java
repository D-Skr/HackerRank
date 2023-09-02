import java.util.Set;
import java.util.stream.Collectors;

public class Pangrams {
    
    public static String pangrams(String s) {
        String result = "not pangram";
        String clearS = s.toLowerCase().replaceAll("\\s+", "");
        Set<Character> set = clearS.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
        if(set.size() == 26) result = "pangram";
        return result;
    }

    public static void main(String[] args) {
        String s1 = "We promptly judged antique ivory buckles for the next prize"; //pangram
        String s2 = "We promptly judged antique ivory buckles for the"; //not pangram
        System.out.println(pangrams(s1));
        System.out.println(pangrams(s2));
    }

}
