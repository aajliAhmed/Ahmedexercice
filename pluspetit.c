#include<stdio.h>
#include<stdlib.h>


int main(){
    int i=0,j=0,n=0,tab[10];
    for(i=0;i<10;i++){
        scanf("%d",&tab[i]);
    }
    for(i=0;i<9;i++){
        for(j=i+1;j<10;j++){
            if(tab[i]<tab[j]){
                n=tab[i];
                tab[i]=tab[j];
                tab[j]=n;
            }

        }
    }
    printf("%d",tab[9]);




return 0;
}
