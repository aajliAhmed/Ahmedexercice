public class Ex14 {
	public static void main(String[] args) {
		affichage();
	}
	public static void affichage() {
		
		long nombre = 1000000,cmpt=0,incremente=1000000,plusGrand=0;
		
		do{
		nombre=incremente;
	    cmpt=0;
		while(nombre != 1){
		if(nombre%2 == 0){
			nombre = nombre/2;
		    cmpt++;
		    }
		    else{
		    	nombre = nombre*3 + 1;
		        cmpt++;
		    }
		}
		if(cmpt > plusGrand) {
			plusGrand = cmpt+1;
			System.out.println(plusGrand+"  ====  "+incremente);
		}
		incremente--;
		}while(incremente != 0 );
	}

}