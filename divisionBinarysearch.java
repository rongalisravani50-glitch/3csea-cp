import java.util.Scanner;

public class divisionBinarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            System.out.println(Integer.MAX_VALUE);
            return;
        }

    
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long p = Math.abs((long) dividend);
        long q = Math.abs((long) divisor);
        long quotient = 0;

        while (p >= q) {
            long temp = q, multiple = 1;
            while (p >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            p -= temp;
            quotient += multiple;
        }


        if (isNegative) {
            quotient = -quotient;
        }

        System.out.println(quotient);
    }
}
