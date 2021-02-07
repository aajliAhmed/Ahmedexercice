#include <stdio.h>
#include <stdlib.h>

int main()
{
      int i=1,n,fact=1;
      printf("entrer un numero :");
      scanf("%d",&n);
      while(i<n+1){
        fact=fact*i;
        i++;

      }

      printf("%d",fact);



      return 0;
}
