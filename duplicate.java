import java.util.*;

public class duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int seen = 0;
        int duplicates = 0;

        
        for (char ch : s.toCharArray()) {
            int bit = 1 << (ch - 'a');

            if ((seen & bit) != 0) {
                duplicates |= bit;
            } else {
                seen |= bit;
            }
        }

        
        int printed = 0;
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int bit = 1 << (ch - 'a');

            if ((duplicates & bit) != 0 && (printed & bit) == 0) {
                ans.append(ch).append(" ");
                printed |= bit;
            }
        }

        if (ans.length() == 0) {
            System.out.println("No duplicates");
        } else {
            System.out.println(ans.toString().trim());
        }

        sc.close();
    }
}
