public class SelectionSorter{
    
    public int[] sorter(int[] x){
    // int array parameters for sorting method

      for (int y = 0; y < x.length - 1; y++){
         int min = y;
         //starting point for going through each array's slot

         for (int z = y + 1; z < x.length; z++){
             // a second loop compares current first index value to all the slot values (it's job gets shorter each time)
            if (x[z] < x[min]){
               min = z;
               // which ever one is lowest is the whole array's lowest value
            }
         }
        int lol = x[y];
        x[y] = x[min];
        x[min] = lol;
        // here the outer loop switches the current y value with the min index's value, then carries on to the next slot
       }
       return x;
       // at the very end, sorted array is returned
   }

   public void printArr(int[] x){
       for(int f=0; f<x.length-1; f++){
           System.out.print(x[f] + " ");
       }
    System.out.println(x[x.length-1]);
   }
   // method with simply forloop that just prints each value in an array (the parameters)

   public static void main(String[]args){
        UnsortedArrays ua = new UnsortedArrays();
        // class instance so we can access it's method which returns an unsorted int array
        SelectionSorter ss = new SelectionSorter();
        // class instance of this class to be able to use our methods
        
        int[] a= ua.getArrOne();
        // set unsorted array to a variable
        ss.printArr(a);
        // printer method from upper class to see all values before sorting

        ss.sorter(a);
        // doing the sorting on our array
    
        ss.printArr(a);
        // use printer method array to see all values that now have been sorted around
   }

 
}