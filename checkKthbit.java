import java.util.Scanner;

public class checkKthbit {

    public static int checkKthBit(int n, int k) {
    
        if ((n & (1 << k)) != 0) {
            return 1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            System.out.println(checkKthBit(n, k));
        }
        
        sc.close();
    }
}
