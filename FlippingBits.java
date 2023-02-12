
public class FlippingBits {
    
    /*
     * You will be given a list of 32 bit unsigned integers. 
     * Flip all the bits ( and ) and return the result as an unsigned integer. 
     * Function Description: Complete the flippingBits function in the editor below.
     * flippingBits has the following parameter(s):
     * int n: an integer
     * Returns
     * int: the unsigned decimal integer result
     * Sample Input
     * 2147483647 
     * 1 
     * 0
     * Sample Output
     * 2147483648 
     * 4294967294 
     * 4294967295
     * Explanation:Take 1 for example, as unsigned 32-bits is 
     * 00000000000000000000000000000001 and doing the flipping 
     * we get 11111111111111111111111111111110 which in turn is 4294967294.
     */

       public static long flippingBits(long n) {
           return n ^ 0xFFFFFFFFl;
       }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
