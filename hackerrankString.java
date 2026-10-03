import java.util.*;

public class hackerrankString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String target = "hackerrank";
        int j = 0;

        for (int i = 0; i < s.length() && j < target.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
        }

        if (j == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
