//How to find GCD (Greatest Common Divisor) of two numbers using recursion?

public class GCD {
    
    /*
     * Step 1: Recursive case - the flow
     * Step 2: Base case - the stopping criterion
     * Step 3: Unintentional case - the constraint
     */

    public static int gcd(int a, int b) {
        //step 2
        if (b == 0) return a;
        
        //step 1: Euclidean algorithm
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        
        
        

    }

}
