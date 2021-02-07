
#include<stdlib.h>
#include <stdio.h>

int main(){

 int tab[50],n=0,i=0,j=0;


 printf("Entrer un nombre entre 1 et 50 :");
 scanf("%d", &n );
 printf("Entrer les nombres : " );
        for (int i=0; i<n; i++){
                scanf("%d", &tab[i]);
        }

    for (i=0,j=0; i<n ; i++){
                tab[j] = tab[i];
                if (tab[i]!=0){
                j++;
            }

    }
 printf("les numero sont 0 :\n");
 for (i=0; i<j; i++)
     printf("%d ", tab[i]);
 return 0;
}


