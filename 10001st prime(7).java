public class Main
{
	public static void main(String[] args) {

	int b,nombre=1,cmpt=0;

    while(nombre <=1000000){
         b=0;
         nombre++;
         for (int i=1 ; i<=nombre ; i++){
            if (nombre%i==0){
                b++;
         }
    }
         if(b==2){
                cmpt++;
         }
         if(cmpt == 10001){
             System.out.println(nombre);
         }
   }
	    
	}
}