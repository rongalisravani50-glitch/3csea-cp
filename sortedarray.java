import java.io.*;
import java.util.*;

public class sortedarray {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0;
        int j = 0; 
        int k = 0; 
     while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++; } 
        while (i < n) {
            merged[k] = arr1[i];
            i++;
            k++; }
        while (j < m) {
            merged[k] = arr2[j];
            j++;
            k++;}
         return merged;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        if (!sc.hasNextInt()) return;
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        int[] result = mergeSortedArrays(arr1, arr2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
