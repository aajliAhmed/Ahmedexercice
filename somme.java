package exercice11;
import java.util.Scanner;

public class somme {
	public static void main(String[]  args) {
		Scanner scanf = new Scanner(System.in);
		int val1 , val2 , resultat;
		System.out.print("Entrer nombre 1 : ");
		val1 = scanf.nextInt();
		System.out.print("Entrer nombre 2 : ");
		val2 = scanf.nextInt();
		resultat = addition(val1 , val2);
		System.out.print("resultat est :"+resultat);
	}
	public static int addition(int nombre1,int nombre2) {
		int somme;
		somme = nombre1 + nombre2;
		return somme;
	}

}
