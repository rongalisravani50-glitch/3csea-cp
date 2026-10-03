import java.util.Scanner;

public class period{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        int n = s.length();
        
    
        
        int[] lps = new int[n];
        
        
        for (int i = 1; i < n; i++) {
            int j = lps[i - 1];
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = lps[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }
        
        
        int smallestPeriod = n - lps[n - 1];
        System.out.println(smallestPeriod);
        
        sc.close();
    }
}
