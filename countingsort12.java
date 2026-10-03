import java.util.Scanner;

public class countingsort12 {
    public static void countingSort(int[] arr) {
        int[] count = new int[100];
        for (int num : arr) {
            count[num]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            while (count[i] > 0) {
                sb.append(i).append(" ");
                count[i]--;
            }
        }
        
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            countingSort(arr);
        }
        
        scanner.close();
    }
}
