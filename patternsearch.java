import java.util.Scanner;

public class patternsearch {

    
    public static void search(char[] pat, char[] txt) {
        int M = pat.length;
        int N = txt.length;

        
        int[] lps = new int[M];
        computeLPSArray(pat, M, lps);

        int i = 0;
        int j = 0; 
        
        while (i < N) {
            if (pat[j] == txt[i]) {
                j++;
                i++;
            }
            if (j == M) {
                
                System.out.print((i - j)+ " \n" );
                j = lps[j - 1];
            }
            
            else if (i < N && pat[j] != txt[i]) {
                
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }


    private static void computeLPSArray(char[] pat, int M, int[] lps) {
        int len = 0;
        int i = 1;
        lps[0] = 0; 

        while (i < M) {
            if (pat[i] == pat[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String txtStr = sc.nextLine();
            if (sc.hasNextLine()) {
                String patStr = sc.nextLine();
                
                char[] txt = txtStr.toCharArray();
                char[] pat = patStr.toCharArray();
                
                search(pat, txt);
            }
        }
        sc.close();
    }
}
