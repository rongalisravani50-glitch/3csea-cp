import java.util.*;

public class ThugOfWar {

    static int n;
    static int[] arr;
    static int total;
    static int ans = Integer.MAX_VALUE;

    static void solve(int index, int count, int sum) {
        
        int target = n / 2;

        if (count == target) {
            int otherSum = total - sum;
            ans = Math.min(ans, Math.abs(sum - otherSum));
            return;
        }

        if (index == n) {
            return;
        }

    
        solve(index + 1, count + 1, sum + arr[index]);

        
        solve(index + 1, count, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        solve(0, 0, 0);

        System.out.println(ans);

        sc.close();
    }
}
