#include <stdio.h>
#include <stdlib.h>

typedef struct{
    char nom[10];
    char tel[16];

}PERS;

void saisir_personne(PERS client[])
{
    printf("entrer les noms des personnes et leurs numero : \n");
	for (int i=0; i<5; i++){
		printf("Nom de Client  : ");
        scanf("%s", client[i].nom);
        printf(" Son Numero  : ");
        scanf("%s", client[i].tel);
	}
}

void menu(){
            printf("\n--------menu--------------- \n");
			printf("1-afficher le repertoire\n");
			printf("2-chercher le numero d'un Client\n");
			printf("3-Quitter\n");
			printf("Votre choix : ");

}


int main(){

    PERS client[5];
    int choix=0;
    char compare[10];
    saisir_personne(client);
    do{
    menu(choix);
    scanf("%d", &choix);
            if(choix==1){
                for(int i=0;i<5;i++){
                    printf("le nom de Client : %s\n",client[i].nom);
                    printf("le numero de Client : %s\n\n",client[i].tel);

                }
            }
            if(choix==2){
                    printf("entrer le nom :");
                    scanf("%s",compare);
                    for (int i=0; i<5; i++){
                            if (strcmp(compare, client[i].nom) == 0){
                                printf("\nLeur numero est :%s",client[i].tel);
                            }
                    }
            }





    }while(choix !=3);




    return 0;
}
