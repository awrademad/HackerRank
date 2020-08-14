import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
   public void compare (int [] a){
        for (int i =0; i < 6; i++){
           // System.out.println(a[i]);
            if (a[2]> a[5]){
                System.out.println("10000");
                break;
            }
            
            if ((a[1] > a[4]) && (a[2] == a[5])) {
                int day = a[1] - a[4];
                System.out.println(500 * day);
                break;
            }
            
            if ((a[0] > a[3]) && (a[2] == a[5]) && (a[1] == a[4])){
                int day = a[0] - a[3];
                System.out.println(15 * day);
                break;
            }
            
            else {
                System.out.println("0");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Solution sol = new Solution();
        int [] a = new int[6];
        for (int i =0; i < 6; i++){
            a[i]= sc.nextInt();
           // sol.compare(a);
            
        }
          sol.compare(a);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}