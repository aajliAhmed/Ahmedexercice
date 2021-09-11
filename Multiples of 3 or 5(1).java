public class Main
{
	public static void main(String[] args) {

		int number1 = 1,number2=0;
		
		while(number1 != 1000){
		    if((number1 % 3 == 0) || (number1 % 5 ==0)){
		        number2 = number2+number1;
		        System.out.println(number2);
		    }
		    number1++;
		}
		
	}
}