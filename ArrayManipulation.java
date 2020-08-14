import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            arr[a-1] += k;
            if (b < n)
                arr[b] -= k;
        }
        long max =0;
        long temp=0 ;
        for (int j=0; j < n; j++){ 
           // System.out.println(arr[j]);
                temp += arr[j];
                if (max < temp)            
                    max = temp;            
        }
        System.out.println(max);

      
        in.close();
    }
}
