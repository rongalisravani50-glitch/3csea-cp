import java.io.*;
import java.util.*;

public class countingsort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] frequency = new int[100];
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            frequency[num]++;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(frequency[i] + (i < 99 ? " " : ""));
        }
    }
}
