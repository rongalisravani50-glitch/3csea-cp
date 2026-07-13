import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class interchanging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i; 
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i; 
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
          scanner.close();
    }
}
