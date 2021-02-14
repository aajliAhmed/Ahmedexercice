#include <stdio.h>
#include <stdlib.h>

void suite(){
    int U0=1,U1=1,r=0,n=0;
    printf("entrer un nombre :");
    scanf("%d",&n);
    for(int i=0;i<n-1;i++){
        r=U0+U1;
        U0=U1;
        U1=r;
    }
    printf("la suite Un+1 = %d ",r);

}






int main(){

    suite();

    return 0;

}
