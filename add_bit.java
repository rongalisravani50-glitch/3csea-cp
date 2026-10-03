import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class add_bit{
    static int add(int a,int b){
        int carry=0;
        while(b!=0){
            carry=a&b;
            a=a^b;
            b=carry<<1;
            
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         int result=add(a,b);
         System.out.println(result);
        
    
    
}}
