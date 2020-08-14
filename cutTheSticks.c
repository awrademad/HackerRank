#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int main() {
    int n, a[1001]={0},na, i, count;
    scanf("%d",&n);
    for (i=0;i<n;i++){
        scanf("%d", &na);
        a[na] ++;
    
        
         
    }
      count = n;    

    for (i = 0; i <= 1000; i++){
        if (a[i] != 0){        
        printf("%d\n", count);
        count = count - a[i] ;
        }
    }
    
    return 0;
}
