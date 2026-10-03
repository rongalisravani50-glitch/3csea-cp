import java.util.Scanner;

public class 3N+1problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            
            int originalI = i;
            int originalJ = j;
            
            
            if (i > j) {
                int temp = i;
                i = j;
                j = temp;
            }
            
            int maxCycleLength = 0;
            
            
            for (int k = i; k <= j; k++) {
                int currentLength = getCycleLength(k);
                if (currentLength > maxCycleLength) {
                    maxCycleLength = currentLength;
                }
            }
            
    
            System.out.println(originalI + " " + originalJ + " " + maxCycleLength);
        }
        
        scanner.close();
    }
    
    
    private static int getCycleLength(long n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        return count;
    }
}
