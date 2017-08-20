import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aliceRes=0;
        int bobRes=0;
        aliceRes=(a0>b0)?1:0;
        if(a1>b1){aliceRes=aliceRes+1;}
        if(a2>b2){        aliceRes=aliceRes+1;}
         bobRes=(a0<b0)?1:0;
        if(a1<b1){bobRes=bobRes+1;}
        if(a2<b2){bobRes=bobRes+1;}
        System.out.print(aliceRes+" "+bobRes);
    }
}