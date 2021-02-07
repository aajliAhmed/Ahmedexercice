#include <stdio.h>
int main(){

int matrice[3][3];
int matrice2[3][3];
int matrice3[3][3];
int ligne=3,colonne=3;
int ligne2=3,colonne2=3;


for(int i=0;i<ligne;i++){
   for(int j=0;j<colonne;j++){
    scanf("%d",&matrice[i][j]);

   }
}

for(int i=0;i<ligne;i++){
   for(int j=0;j<colonne;j++){
    printf("%3d",matrice[i][j]);

   }
   printf("\n");
}
printf("\n\n");

for(int i=0;i<ligne2;i++){
   for(int j=0;j<colonne2;j++){
    scanf("%d",&matrice2[i][j]);

   }
}

for(int i=0;i<ligne2;i++){
   for(int j=0;j<colonne2;j++){
    printf("%3d",matrice2[i][j]);

   }
   printf("\n");
}
printf("\n\n");
for(int i=0;i<ligne2;i++){
   for(int j=0;j<colonne2;j++){
        matrice3[i][j]=matrice2[i][j]+matrice[i][j];

   }
}


for(int i=0;i<ligne2;i++){
   for(int j=0;j<colonne2;j++){
    printf("%3d",matrice3[i][j]);

   }
   printf("\n");
}



return 0;
}
