#include<stdlib.h>
#include<stdio.h>

int main(){
    int tab[10],max=0,min=0;


    for(int i=0;i<9;i++){
        printf("entrer les nombres %d : ",i+1);
        scanf("%d",&tab[i]);
    }
    for(int i=0;i<9;i++){
        if(tab[i]>tab[max]){
                max =i;
        }
        if(tab[i]<tab[min]){
                min =i;
        }

    }
    printf("la valeur plus grand est : %d",tab[max]);
    printf("\nposition de max est : %d\n",max+1);
    printf("la valeur plus petit est : %d",tab[min]);
    printf("\nposition de min est : %d",min+1);










    return 0;
}
