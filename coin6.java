import java.io.*;
import java.util.*;

public class coin6 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int N = sc.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int INF = 1000000000;
        int[] dp = new int[V + 1];

        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int amount = 1; amount <= V; amount++) {
            for (int i = 0; i < N; i++) {
                int coin = coins[i];

                if (coin <= amount && dp[amount - coin] != INF) {
                    dp[amount] = Math.min(
                        dp[amount],
                        dp[amount - coin] + 1
                    );
                }
            }
        }

        if (dp[V] == INF) {
            System.out.println("-1");
        } else {
            System.out.println(dp[V]);
        }
    }
}
