package OCTLong;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class POSAND
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            if(isPow(n) && n!=1){
                System.out.println(-1);
            } else {
                if(n<10){
                    switch (n) {
                        case 1 -> System.out.println(1);
                        case 3 -> System.out.println(1 + " " + 3 + " " + 2);
                        case 5 -> System.out.println(2 + " " + 3 + " " + 1 + " " + 5 + " " + 4);
                        case 6 -> System.out.println(2 + " " + 3 + " " + 1 + " " + 5 + " " + 4 + " " + 6);
                        case 7 -> System.out.println(2 + " " + 3 + " " + 1 + " " + 5 + " " + 4 + " " + 6 + " " + 7);
                        case 9 -> System.out.println(2 + " " + 3 + " " + 1 + " " + 5 + " " + 4 + " " + 6 + " " + 7 + " " + 9 + " " + 8);
                    }
                } else {
                    StringBuilder sb=new StringBuilder("2 3 1 5 4 6 7 9 8 ");
                    for(int i=10;i<=n;i++){
                        if(isPow(i)){
                            sb.append(i+1).append(" ");
                            sb.append(i).append(" ");
                            i=i+1;
                        } else {
                            sb.append(i).append(" ");
                        }
                    }
                    System.out.println(sb)
                    ;		        }
            }
        }
    }

    static boolean isPow(int n){
        if(n==0){
            return false;
        }
        double v = Math.log(n) / Math.log(2);
        return (int)(Math.ceil(v)) == (int)(Math.floor(v));
    }
}
