#include<stdio.h>
#include<stdlib.h>




int main(){
    int tab[5],a=0;
    printf("entrer les nombres :");
    for(int i=0;i<5;i++){
        scanf("\n\n%d",&tab[i]);
    }
    for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(tab[i]<tab[j]){
                a=tab[i];
                tab[i]=tab[j];
                tab[j]=a;
        }
        }
        printf("===>%d",tab[i]);
    }







    return 0;
}
