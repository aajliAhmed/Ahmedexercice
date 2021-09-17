import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
	    
		calcule();
		
	}
	public static void calcule(){
	    
	    BigInteger power = new BigInteger("2");
		BigInteger diviseur = new BigInteger("10");
		BigInteger nombre1 = new BigInteger("0");
		BigInteger nombre2 = new BigInteger("0");
		BigInteger nombre3 = new BigInteger("1");
	
		power = power.pow(1000);
		
		while(power != nombre3){
		    nombre1 = power.mod(diviseur);
            nombre2 = nombre2.add(nombre1);
		    power = power.divide(diviseur);
		    System.out.println(nombre2);
		}
		
	}
}