import java.util.Scanner;

/**
 * Fibonnacci Calculator
 * @author Burak Ozturk
 * @version 09.10.2020
 */

public class Fibonacci
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      IntBag fBag;

      // program code
      System.out.println( "Start...");
      
      fBag = new IntBag();
      
      fBag.add( 0, 0);
      fBag.add( 1, 1);
      
      for ( int i = 2; i < 40; i++)
         fBag.add( i, ( fBag.get( i - 1) + fBag.get( i - 2) ) );
      
      System.out.println( fBag.toString());
      
      
      System.out.println( "End.");
   }

}