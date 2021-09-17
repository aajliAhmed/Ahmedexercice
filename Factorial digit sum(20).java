import java.math.BigInteger;
public class Main
{
	public static void main(String[] args) {
	    sumFactorielle();
	}
	public static void sumFactorielle(){
	    
	    BigInteger fact = new BigInteger("1");
	    BigInteger inc = new BigInteger("1");
	    BigInteger one = new BigInteger("1");
	    BigInteger nombre = new BigInteger("0");
	    BigInteger ten = new BigInteger("10");
		
		for(int i=1;i<=100;i++){
		    fact = fact.multiply(inc);
		    inc = inc.add(one);
		}
		
		while(fact != BigInteger.ZERO){
		    one = fact.mod(ten);
		    nombre = nombre.add(one);
		    fact = fact.divide(ten);
		}
		System.out.println(nombre);
	}
}