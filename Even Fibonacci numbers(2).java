public class Main
{
	public static void main(String[] args) {

	long a=1,b=1,r=0,n=4000000;
    long nombre=0;

    for(int i=2;i<n;i++){
        if(r<4000000){
        r=a+b;
        a=b;
        b=r;
           if(r%2==0){
        nombre=nombre+r;
        System.out.println("nombre = "+nombre);
                }
	       }
        }
	}
}