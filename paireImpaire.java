package exercice15;
import java.util.Scanner;
public class paireImpaire {
	public static void main(String[]  args) {
		
		Scanner scanf = new Scanner(System.in);
		int var1 ;
		
		System.out.print("Entrer nombre 1 : ");
		var1 = scanf.nextInt();
		System.out.println("Nombre d'eteration est : "+syracuse(var1));
		
	}
	public static int syracuse(int nombre) {
		
		int tmp =0;
		
		do {
		if(nombre%2 == 0) {
			nombre = nombre/2;
			System.out.println("le nombre est : "+nombre);
			tmp++;
		}
		else{
			nombre = nombre*3+1;
			System.out.println("le nombre est : "+nombre);
			tmp++;
		}
		}while(nombre != 1);
		
		return tmp;
		
	}

}
