public class InsertionSorter{

    UnsortedArrays ua = new UnsortedArrays();
     // make UnsortedArrays class object
    int[] x = ua.getArrOne();
    // getArrOne method defined in the class returns an arr which I set to a variable for easier access
    
    public void sort(int arr[]){
        // the method that will be doing the insertion sorting, int arr parameters needed
        for(int i=1; i<arr.length; i++){
            // for loop to go through each array slot
            int hold = arr[i];
            // value at index i
            int j= i-1;
            // index before i to be used for comparison
            while(j>-1 && arr[j]>hold){
                /* in order for the while loop instructions to execute j has to be bigger than -1 bc no negative indexs
                and the value at index j much be bigger than value at index i */
                arr[j+1]=arr[j];
                // replaces the slot after j with the current j value since it is larger
                j--;
                // makes j the slot below what it currently is which is then compared to values at i 
         
            }
            arr[j+1]=hold;
            /* while loop stops when value at j is less than hold, so this updates the slot right after j (which has been
            changed by the while loop) to whatever the hold value is */
        }
    }


    public static void main(String[]args){

        InsertionSorter in= new InsertionSorter();
        // class instance from above to access class level code
        in.sort(in.x);
        // call the method onto arr x 
        for(int k: in.x){
            System.out.print(k + " ");
        }
        // prints each slot value after sorted
    }
}