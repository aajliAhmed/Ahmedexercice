#include<stdio.h>
#include<stdlib.h>


void entrer(){

    int tab[10];

    for(int i=0;i<5;i++){
        printf("entrer le nombre %d:",i+1);
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
    }


}

void afficher(){
    int tab[10];
    for(int i=0;i<5;i++){
            printf("<=%d",tab[i]);
    }


}


int main(){

    entrer();
    trier();
    afficher();
    return 0;
}
