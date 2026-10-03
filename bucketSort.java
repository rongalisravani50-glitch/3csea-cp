import java.util.*;

public class bucketSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] a = new double[n];

        boolean fractional = true;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();

            if (a[i] >= 1) {
                fractional = false;
            }
        }

        ArrayList<Double>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        if (fractional) {
            
            for (int i = 0; i < n; i++) {
                int index = (int)(a[i] * n);

                if (index >= n) {
                    index = n - 1;
                }

                buckets[index].add(a[i]);
            }
        } else {
            
            double min = a[0];
            double max = a[0];

            for (double x : a) {
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            for (double x : a) {
                int index;

                if (max == min) {
                    index = 0;
                } else {
                    index = (int)((x - min) * (n - 1) / (max - min));
                }

                buckets[index].add(x);
            }
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        
        boolean first = true;

        for (int i = 0; i < n; i++) {
            for (double x : buckets[i]) {
                if (!first) {
                    System.out.print(" ");
                }

                if (fractional) {
                    System.out.printf("%.2f", x);
                } else {
                    System.out.printf("%.0f", x);
                }

                first = false;
            }
        }

        System.out.println();
        sc.close();
    }
}
