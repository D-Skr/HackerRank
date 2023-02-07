//converting number from Decimal to Binary using recorsion

public class DecimalToBinary {
    
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
