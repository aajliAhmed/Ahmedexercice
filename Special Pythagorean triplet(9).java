public class Main
{
	public static void main(String[] args) {
		
	    int a=0,b=0,c=0;
	    int arr1[] = new int[1000];
	    int arr2[] = new int[1000];
	    int arr3[] = new int[1000];
	    
	    for(int i=0;i<1000;i++){
	        arr1[i] = (int)Math.pow(i,2);
	        arr2[i] = (int)Math.pow(i,2);
	        arr3[i] = (int)Math.pow(i,2);
	    }
	    for(int i=0;i<1000;i++){
	        for(int j=0;j<1000;j++){
	            for(int k=0;k<1000;k++){
	                if(arr1[i] + arr2[j] == arr3[k] && i+j+k == 1000){
	                    System.out.println("======="+k*j*i);
	                }
	            }
	        }
	    }
	    
	    
	}
}