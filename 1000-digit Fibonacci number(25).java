import java.math.BigInteger;
public class Main
{
	public static void main(String[] args) {
	    emplacement();
	}
	public static void emplacement(){
	    
	    int compt =2;
		BigInteger valeur1 = new BigInteger("1");
		BigInteger valeur2 = new BigInteger("1");
		BigInteger resultat = new BigInteger("1");
		
		
		for(int i=0;i<10000;i++){
		    if(resultat.toString().length() != 1000){
	        	compt++;
                resultat=valeur1.add(valeur2);
                valeur1=valeur2;
                valeur2=resultat;
                
	    	}
		
         }
    System.out.println(compt);
	}
}