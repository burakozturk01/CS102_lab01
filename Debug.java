import java.util.Scanner;
public class Debug
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      IntBag bag;

      // program code
      System.out.println( "Start...");
      
      bag = new IntBag();
      
      bag.add( 0, 3);
      bag.add( 1, 4);
      bag.add( 2, 7);
      bag.add( 2, 5);
      
      System.out.println( bag.toString() );


      System.out.println( "End.");
   }

}