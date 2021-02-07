#include<stdio.h>
#include<stdlib.h>


void entrer(){

    int tab[10];
    printf("entrer les nombres :");
    for(int i=0;i<5;i++){
        scanf("%d",&tab[i]);
    }

}

void trier(){
    int tab[10],a=0;
    for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(tab[i]>tab[j]){
                a=tab[i];
                tab[i]=tab[j];
                tab[j]=a;
        }

        }
        printf("===>%d",tab[i]);
    }


}


int main(){

    entrer();
    trier();

    return 0;
}
