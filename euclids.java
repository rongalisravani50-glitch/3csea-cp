import java.util.Scanner;

public class euclids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) return;
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long[] result = extGCD(a, b);
        long d = result[0];
        long x0 = result[1];
        long y0 = result[2];
        
        
        long stepX = b / d;
        long stepY = a / d;
        
        long bestX = x0;
        long bestY = y0;
        long minSum = Long.MAX_VALUE;
        
        
        for (long k = -5; k <= 5; k++) {
            long x = x0 + k * stepX;
            long y = y0 - k * stepY;
            
            long currentSum = Math.abs(x) + Math.abs(y);
            
            
            if (currentSum < minSum) {
                minSum = currentSum;
                bestX = x;
                bestY = y;
            } else if (currentSum == minSum) {
                if (x <= y) {
                    bestX = x;
                    bestY = y;
                }
            }
        }
        

        System.out.println(bestX + " " + bestY + " " + d);
    }

    public static long[] extGCD(long a, long b) {
        if (b == 0) {
            return new long[]{a, 1, 0};
        }
        long[] next = extGCD(b, a % b);
        long gcd = next[0];
        long x1 = next[1];
        long y1 = next[2];
        
        long x = y1;
        long y = x1 - (a / b) * y1;
        
        return new long[]{gcd, x, y};
    }
}
