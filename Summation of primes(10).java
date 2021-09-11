public class Main
{
	public static void main(String[] args) {

	long a=2000000,b=0,nombre=0,c=0;

	while(nombre <=a){
         b=0;
         nombre++;
         for (long i=1 ; i<=nombre ; i++){
            if (nombre%i==0){
                b++;
         }
    }
         if(b==2){
             if(nombre<2000000){
             c = c + nombre;
             System.out.println(c);
             }
         }
         
         }
	    
	}
}