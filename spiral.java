import java.util.*;

public class spiral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        StringBuilder ans = new StringBuilder();

        while (top <= bottom && left <= right) {

            
            for (int j = left; j <= right; j++) {
                ans.append(a[top][j]).append(" ");
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                ans.append(a[i][right]).append(" ");
            }
            right--;

    
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.append(a[bottom][j]).append(" ");
                }
                bottom--;
            }

        
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.append(a[i][left]).append(" ");
                }
                left++;
            }
        }

        System.out.println(ans.toString().trim());

        sc.close();
    }
}
