import java.util.Scanner;

public class majorityElement {

    public static int majorityElement(int[] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        int candidate = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int actualCount = 0;
        for (int num : arr) {
            if (num == candidate) {
                actualCount++;
            }
        }
        if (actualCount > n / 2) {
            return candidate;
        } return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(majorityElement(arr));
        }
        
        sc.close();
    }
}

