import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class max_subarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] a= new int[size];
        for (int i = 0; i < size; i++) {
         a[i] = sc.nextInt();}
         System.out.println(subarray(a,size));
}
public static int subarray(int[] a,int size ){
  int  max_sofar=a[0];
   int max_end=0;
   for( int i=0;i<size;i++){
    max_end=max_end +a[i];
    if(max_sofar<max_end){
        max_sofar=max_end;}
        if(max_end<0){
            max_end=0;
        }
    }
    return max_sofar;
   }}

