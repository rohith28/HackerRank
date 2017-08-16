import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int cntApple=0;
        int cntOrange=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int appPos=a+in.nextInt();
            if(appPos >= s && appPos <= t)
                {
               cntApple++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
                        int orgPos=b+in.nextInt();
            if(orgPos >= s && orgPos <= t)
                {
                    cntOrange++;   
            }        
        }
        System.out.println(cntApple);
        System.out.println(cntOrange);
       
    }
}
