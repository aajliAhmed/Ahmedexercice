package exercice12;

import java.util.Scanner;

public class siecle {
	public static void main(String[]  args) {
		Scanner scanf = new Scanner(System.in);
		int val1,val2;
		System.out.print("Entrer annee : ");
		val1 = scanf.nextInt();
		val2 = siecle(val1);
		System.out.print("le siecle est : "+val2);
		
	}
	public static int siecle (int annee) {
		int nombre1;
		int nombre2,resultat;
		nombre1 = annee/100;
		nombre1 = nombre1*100;
		nombre2 = annee-nombre1;
		resultat = annee/100;
		if(nombre2==0) {
			return resultat;
		}
		else {
			return resultat+1;
		}
		
		
	}

}
