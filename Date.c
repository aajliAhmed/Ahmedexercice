#include <stdio.h>
#include <stdlib.h>




int main(){
    int j=0,m=0,a=0,cpt=0;
    printf("entrer Jour , Mois et Annee :\n");
    scanf("%d",&j);
    scanf("%d",&m);
    scanf("%d",&a);

    if(j<=31){
        printf("Le jour est : %d\n",j);
        cpt++;
    }
    else{
        printf("Le Jour incorrecte !!\n");
        cpt++;
    }
    if(m<=12){
        printf("Le Mois est : %d\n",m);
        cpt++;
    }
    else{
        printf("Le Mois incorrecte !!\n");
        cpt++;
    }
    if(a>0){
        printf("L'Annee est : %d\n",a);
        cpt++;
    }

    printf("Le nombre de donnees recus : %d\n",cpt);

    return 0;

}
