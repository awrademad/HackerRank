#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
int t, m, i, k;
    int n;
    int c[10000];
    int x =0;
   // scanf("%d", &t);
    	for(scanf("%d",&t);t>0;t--){
        scanf ("%d%d", &m, &n);
        //printf("%d", m);
       
        for (i=0; i < n; i++)
            scanf("%d", &c[i]);
            for(i=0;i<n-1;i++)
            for (k = i + 1; k < n; k++){
  
                if (c[i]+c[k]== m){
                   
                    printf ("%d %d\n", i+1, k+1);
                }
            }
        }
            
            
         
        
  

 
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    
    return 0;
    

}