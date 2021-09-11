public class Main
{
	public static void main(String[] args) {
		
		long cmpt =0,nombre1=1,resultat=0;
		String nombre ="600851475143";
		int tmp = Integer.parseInt(nombre);

		while(nombre1 <=tmp){
		    cmpt =0;
		    nombre1++;
		    for(long i=1;i<=nombre1;i++){
		        if(nombre1%i==0 && tmp%nombre1 ==0){
		            cmpt++;
		        }
		    }
		    if(cmpt==2){
		        resultat=nombre1;
		    }
		}
		System.out.println(resultat);
	}
}