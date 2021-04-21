package exercice10;

import java.util.Scanner;

public class cherche { 
	public static void main(String[] args) {
	Scanner scanf = new Scanner(System.in);
	int nombre,a=0;
	int tab[] = new int [10];
	for(int i=0;i<10;i++) {
		System.out.print("Entrer le nombre "+(i+1));
		tab[i] = scanf.nextInt(); 
	}
	System.out.println("Entrer un nombre :");
	nombre = scanf.nextInt(); 
	for(int i=0;i<10;i++) {
		if(nombre==tab[i]) {
			a++;
		}
	}
	if(a==0) {
		System.out.println("il n'y a pas ce nombre dans le tableau");
	}
	else {
		System.out.println("il y a le meme nombre dans le tableau");
	}
	}
}

