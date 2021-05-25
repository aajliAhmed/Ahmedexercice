package exercice4;

import java.util.Scanner;

public class Recursif {
	public static void main(String[]  args) {
		Scanner scanf = new Scanner(System.in);
		int variable,resultat=0;
		
		System.out.print("Entrer un nombre :");
		variable = scanf.nextInt();
		
		resultat = factorielle(variable);
		System.out.println("réponce est :"+resultat);
		
	}
	public static int factorielle(int nombre)
	{
	   if (nombre == 0){
	        return 1;
	   }

	   else{
	        return nombre * factorielle(nombre - 1);
	   }

	}
	
}







	