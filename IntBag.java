/**
 * Integer array controlling class
 */
public class IntBag 
{
   //properties
   private int[] bag;
   
   //constructors
   public IntBag()
   {
      int[] bag ={ -1, 0, 0, 0};
      this.bag = bag;
   }
   
   //methods
   public int add( int index, int value)
   {
      int l = 0;
      for ( int i = 0; i < bag.length; i++)
      {
         if ( bag[i] == -1)
         {
            l = i;
            i = bag.length;
         }
      }
      System.out.println( "l = " + l);
      
      if ( index < bag.length)
      {
         if( index == l)
         {
            bag[index + 1] = bag[index];
            bag[index] = value;
            
            return index;
         }
         
         else if ( index < l && bag.length > l + 1)
         {
            for ( int i = l; i < index; i++)
            {
               bag[i + 1] = bag[i];
               System.out.println( "i = " + i);
            }
            
            bag[index] = value;
            return index;
         }
         
         else
         {
            int[] newBag = new int[bag.length * 2];
         
            for ( int i = 0; i < bag.length; i++)
               newBag[i] = bag[i];
            
            bag = newBag;
            
            return add( index, value);
         }
      }
      
      else
      {
         int[] newBag = new int[bag.length * 2];
         
         for ( int i = 0; i < bag.length; i++)
            newBag[i] = bag[i];
         
         bag = newBag;
         
         return add( index, value);
      }
   }
   
   public int remove( int index)
   {
      int temp;
      
      if ( index >= bag.length || bag[index] == -1)
         return -1;
      
      else if ( index == bag.length - 1)
      {
         temp = bag[index];
         bag[index] = -1;
         return temp;
      }
      
      else
      {
         int l = 0;
         for ( int i = 0; i < bag.length; i++)
         {
            if ( bag[i] == -1)
            {
               l = i;
               i = bag.length;
            }
         }
         
         temp = index;
         
         for ( int i = index; i < l; i++)
            bag[i] = bag[i + 1];
         
         l = 0;
         
         return temp;
      }
   }
   
   public int get( int index)
   {
      int l = 0;
      for ( int i = 0; i < bag.length; i++)
      {
         if ( bag[i] == -1)
         {
            l = i;
            i = bag.length;
         }
      }
      
      if ( index < l)
         return bag[index];
      else
         return -1;
   }
   
   public int[] getBag()
   {
      return bag;
   }
   
   public void removeAll()
   {
      for ( int i = 1; i < bag.length; i++)
         bag[i] = 0;
      bag[0] = -1;
   }
   
   public String toString()
   {
      
      if ( bag[0] == -1)
         return "{}";
      
      String s = "{ " + bag[0];
      
      for ( int i = 1; i < bag.length; i++)
      {
         if ( bag[i] == -1)
            return s + "}";
         else
         {
            s += ", " + bag[i];
         }
      }
      return s;
   }
}