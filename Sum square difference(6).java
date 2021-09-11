public class Main
{
	public static void main(String[] args) {

	    int number1=0,number2=0,resulat=0,i=0;
	    
	    while(i <= 100){
	        number1 = number1 + (int)Math.pow(i,2);
	        i++;
	    }
	    for(int j=0;j<=100;j++){
	        number2 = number2 + j;
	    }
	    number2 = (int)Math.pow(number2,2);
	    
	    resulat = number2 - number1;
	    System.out.println(resulat);
	    
	}
}