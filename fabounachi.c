#include <stdio.h>
#include <stdlib.h>


int main(){
    int a=0,b=1,r=0,n=0;
    printf("entrer un nombre :");
    scanf("%d",&n);
    for(int i=0;i<n-1;i++){
        r=a+b;
        a=b;
        b=r;
    }
    printf("LE NOMBRE DE FIBUNACHI EST : %d ",r);


    return 0;

}
