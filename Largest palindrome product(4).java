public class Main
{
	static int palindromeRecursion(int number, int temp)
   {
      if(number == 0)
         return temp;
      temp = (temp * 10) + (number % 10);
      return palindromeRecursion(number / 10, temp);
   }
   public static void main(String[] args)
   {

      int number = 0,a=100,b=100;
      
      while(b!=999){
          a = 100;
      while(a!=999){
          number = a*b;
      
      int temp = palindromeRecursion(number, 0);
      if(temp == number)
      {
         System.out.println("number is palindrome."+number);
      }
      a++;
      
     }
     b++;
      }
      
   }
}