//converting number from Decimal to Binary using recorsion

public class DecimalToBinary {
    
    /*
     *Step 1: Divide the number by 2
     *Step 2: Get the integer quotient for the next iteration
     *Step 3: Get the remainder for the binary digit
     *Step 4: Repeat the steps until the quotient is equal to 0  
     */
    
    public static int decToBin(int n) {
        
        if(n == 0) {
            return 0;
        }
        return n%2 + 10 * decToBin(n/2);
    }

    public static void main(String[] args) {
        
        System.out.println(decToBin(145));

    }

}
