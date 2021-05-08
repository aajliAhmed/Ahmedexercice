package exercice14;

import java.util.Scanner;

public class grandMulti {
	public static void main(String[]  args) {
		Scanner scanf = new Scanner(System.in);
		int tab[] = new int [10];
		int tab2[] = new int [10];
		int grandNbr = 0;
		
		for(int i=0;i<6;i++) {
			System.out.print("Entrer le nombre "+(i+1));
			tab[i] = scanf.nextInt(); 
		}
		for(int i=0;i<6;i++) {
			tab2[i] = tab[i]*tab[i+1];
		}
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<6;j++) {
				if(tab2[i]<tab2[j]) {
					grandNbr = tab2[j];
			}		
			}
		}
		System.out.println("le grand nombre est : "+grandNbr);
		
		
	
		
	}

}
