public class Main

{
	public static void main(String[] args) {

		plusGrandDiviseur(500,8);

	}

	public static void plusGrandDiviseur(int number1,int number2){

	int suiv=0,cmpt=0;
		for(int i=0;i<=number1;i++){
		    suiv = suiv+i;
		    cmpt = 0;
		    for(int j=1;j<=suiv;j++){
		        if(suiv%j == 0 ){
		            cmpt++;
		        }
		        if(cmpt == number2){
		            System.out.println("======="+suiv);
		        }
		        
		    }
		    
		}
	}
	
}