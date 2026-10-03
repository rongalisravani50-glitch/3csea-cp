

import java.io.*;
import java.util.*;

public class waterjug{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int A=sc.nextInt();
        int B=sc.nextInt();
        int T=sc.nextInt();
        if(T>A+B){
            System.out.println("NO");
        }
        if(T==0){
            System.out.println("YES");
        }
        while(B!=0){
       int temp=B;
          B=A%B;
         A=temp;
}
     if(T%A==0){
        System.out.println("YES");
     }
     else{
        System.out.println("NO");
     }
       
        }
       
}

