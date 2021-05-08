#include <stdio.h>
#include <stdlib.h>

void soduko(){
    int tab[10],var1=0;
    for(int i=0;i<9;i++){
        printf("Entrer le numero %d : ",i+1);
        scanf("%d",&tab[i]);
    }
    for(int i=0;i<9;i++){
        if(tab[i] > 9){
            var1++;
        }

    }
    for(int i=0;i<9;i++){
        for(int j=i+1;j<9;j++){
            if(tab[i]==tab[j]){
                var1++;
            }
        }
    }
    if(var1==0){
        printf("le soduko est correct");
    }
    else{
        printf("le soduko est incorrect");
    }

}

int main (){
    soduko();
}
