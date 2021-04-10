#include<stdio.h>


void nbrPremier (){
    int a,b,nombre=1;

    printf("Entrer le nombre : ");
    scanf("%d",&a);
    printf("les nombres premier est :");

    while(nombre <=a){
         b=0;
         nombre++;
         for (int i=1 ; i<=nombre ; i++){
            if (nombre%i==0){
                b++;
         }
    }
         if(b==2){
            printf("%d  ",nombre);
         }
   }
}

int main()
{
    nbrPremier ();
    return 0;
}
