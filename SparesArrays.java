import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[]= new String [n+1];
        for (int i =0; i <= n; i++){
            arr[i] = sc.nextLine();
        }
        int query = sc.nextInt();
        String arr2[]= new String[query+1];
        for(int i=0; i <= query; i++){
            arr2[i]= sc.nextLine();
         //   System.out.println(arr2[i]);
        }
        for(int i=1; i <= query; i++){
            for(int j=1; j<= n; j++){
                
                if (arr2[i].equals(arr[j]))
                    count++;
            }
            System.out.println(count);
            count =0;
        }
    }
}