#include <stdio.h>
#include <stdlib.h>
#include<math.h>

void ConvertireEn01 (){
    int nombre=0,tab[20],i=0;

    printf("Entrer un nombre Decimal : ");
  scanf("%d",&nombre);
  do{
  for(i=0; nombre>0; i++){

    tab[i] = nombre%2;
    nombre = nombre/2;
  }

  }while(nombre!=0);

  printf("\nLe nombre binaire est =  ");

  for(i=i-1; i>= 0; i--)
  {
    printf("%d",tab[i]);
  }


}
void convertirEnDec (){

int a=0,b=0;
int tab[20];
printf("Combien de nombre tu va entrer( Exemple 1010 = 4): ");
scanf("%d",&a);

for(int i=a-1;i>=0;i--){
    printf(" Nombre %d :",a-i);
    scanf("%d",&tab[i]);
}

for(int i=0;i<a;i++){
    b=b+tab[i]*pow(2,i);
}
 printf("Nombre en Decimal est : %d",b);
}

int main()
{
    int choix=0;
    do{

    printf("\nEntrer 1 pour convertire un nombre dicimal en binaire  \n");
    printf("Entrer 2 pour convertire un nombre binaire en dicimal  \n");
    printf("Entrer 3 pour quitter le programme \n");
    printf("votre choix est :");
    scanf("%d",&choix);

    if(choix==1){
        ConvertireEn01 ();
    }
    else if(choix==2){
        convertirEnDec ();
    }
    }while(choix!=3);



  return 0;
}
