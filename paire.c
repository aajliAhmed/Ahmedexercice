#include <stdio.h>
#include <stdlib.h>

int main()
{
    int nbr=0,i=0;

    printf("entrer un nombre :");
    scanf("%d",&nbr);
    do{
    if(nbr%2==0){
        nbr=nbr/2;
        printf("%d\n",nbr);
        i++;
    }
    else{
        nbr=nbr*3+1;
        printf("%d\n",nbr);
        i++;
    }

    }while(nbr!=1);
    printf("Nombre d'iterations : %d",i);
    return 0;
}
