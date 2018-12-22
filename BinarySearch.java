public class BinarySearch{
   public static void main(String args[]){
      int counter, num=7, item, first, last, middle;
      int[] array = {4,5,66,77,8,99,0};
      System.out.println("Enter the search value:");
      item = 77;
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last ){
         if ( array[middle] < item )
            first = middle + 1;
         else if ( array[middle] == item ){
            System.out.println(item + " found at location " + (middle + 1) + ".");
            break;
         }
         else
            last = middle - 1;
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}