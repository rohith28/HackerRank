import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int min=0;
        int max=0;
        int minCnt=0;
        int maxCnt=0;
      
        for(int i=0;i<s.length;i++){
            if(i==0)
            {
                min=s[i];
                max=s[i];
            }
            else{
                if(min>s[i])
                {
                    min=s[i];
                    minCnt++;
                }
                else if(s[i]>max)
                {
                    max=s[i];
                    maxCnt++;
                }
            }
            
        }
      int[] result=new int[2];
        result[0]=maxCnt;
        result[1]=minCnt;
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}