public class Main
{
	public static void main(String[] args) {

		int number = 1,ver=0;

		  for(int i=1;i<=1000000000;i++){
		      for(int j=1;j<=20;j++){
		          if(i%j == 0){
		                ver++;
		                
		            }
		            if(ver == 20){
		                System.out.println(i);
		            }
		        }
		        ver=0;
		    }
		}
}