import java.util.Scanner;

/**
 * Menu Demo
 * @author Burak Ozturk
 * @version 09.10.2020
 */

public class MenuDemo
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      IntBag fBag;
      int input, input2;
      boolean isNull;

      // program code
      System.out.println( "Start...");
      
      fBag = new IntBag();
      isNull = true;
      
      do
      {
         System.out.println( "1. Create a new empty collection(any previous values are lost!)");
         System.out.println( "2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
         System.out.println( "3. Print the collection of values.");
         System.out.println( "4. Add a value to the collection of values at a specified location");
         System.out.println( "5. Remove the value at a specified location from the collection of values");
         System.out.println( "6. Remove all instances of a value within the collection* (see note below).");
         System.out.println( "7. Quit the program.");
         
         input = scan.nextInt();
         input2 = 0;
         
         if ( input == 1)
         {
            fBag = new IntBag();
            isNull = false;
         }
         
         else if ( input == 2 && !isNull)
         {
            int count = 0;
            int value;
            do
            {
               value = scan.nextInt();
               if ( value > 0)
               {
                  fBag.add( count, value);
                  count++;
               }
               else if (value < 0)
                  System.out.println( "Value must be positive");
               
            } while ( value != 0);
         }
         
         else if ( input == 3 && !isNull)
         {
            System.out.println( fBag.toString() );
         }
         
         else if ( input == 4 && !isNull)
         {
            System.out.println( "Where?");
            int index = scan.nextInt() - 1;
            if ( index < 0)
               System.out.println( "Location must be bigger than 0");
            else
            {
               System.out.println( "What?");
               int value = scan.nextInt();
               if ( value < 1)
                  System.out.println( "Value must be positive");
               else
                  fBag.add( index, value);
            }
         }
         
         else if ( input == 5 && !isNull)
         {
            System.out.println( "Where?");
            int index = scan.nextInt() - 1;
            if ( index < 0)
               System.out.println( "Location must be bigger than 0");
            else
               fBag.remove( index);
         }
         
         else if ( input == 6 && !isNull)
         {
            System.out.println( "What?");
            int value = scan.nextInt();
            fBag.removeAll( value);
         }
         
         else if ( input == 7)
            System.out.println( "goodbye");
         
      } while ( input != 7);
      
      
      System.out.println( "End.");
   }

}