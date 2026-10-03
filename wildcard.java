import java.io.*;

public class wildcard{

    static boolean isMatch(String s, String p) {
        int i = 0, j = 0;

        int star = -1;
        int starMatch = -1;

        while (i < s.length()) {

    
            if (j < p.length() &&
                (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            }

            
            else if (j < p.length() && p.charAt(j) == '*') {
                star = j;
                starMatch = i;
                j++;
            }

    
            else if (star != -1) {
                j = star + 1;
                starMatch++;
                i = starMatch;
            }

            
            else {
                return false;
            }
        }

        
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        return j == p.length();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String p = br.readLine();

    
        s = s.trim();
        p = p.trim();

        System.out.println(isMatch(s, p) ? 1 : 0);
    }
}
