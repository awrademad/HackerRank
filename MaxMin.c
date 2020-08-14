#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <limits.h>

#define MAX 100000
#define MAX_VAL 1000000001


int list[MAX];
int compare(int *a,int *b)
{
	return *(int*)a-*(int*)b;
}

int main() {
    
    int N,K;
    int i,j,k,a;
    
    scanf("%d %d",&N,&K);
    for(i = 0;i < N;i++)
        scanf("%d", &list[i]);
  
    	qsort(list,N,sizeof(int),compare);
  //  printf("The numbers arranged in ascending order are given below \n");
   // for (i = 0; i < N; ++i)
       // printf("%d\n", list[i]);

    int unfairness = INT_MAX;// Compute the min unfairness over here, using N,K,candies
    for ( i = 0; i < N-K+1; i++) {
       int temp = list[i+K-1]-list[i];
        if (temp < unfairness)
            unfairness = temp;
}
    
        
    printf("%d",unfairness);
    return 0;
}
