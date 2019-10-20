import java.util.BufferedReader;
 
class Factorial
{
   public static void main(String args[])
   {
      int a;
    int  c;
    int fact = 1;
    BufferedReader o1 =  new BufferedReader(inputStreamReader(system.in));
    
     
      System.out.println(" Enter an integer ");
      int num = o1.readLine();
     a = Integer.parseInt ( num );
     
      if (a < 0)
         System.out.println("Number should be non-negative.");
      else
      {
         for (c = a; c >= 0; c--)
            fact = fact*c;
     
         System.out.println("Factorial of "+a+" is = "+fact);
      }
   }
}
