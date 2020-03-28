public class LinearSearch{

    public int linearSearch(int[] x, int target){
    // requires an int array and target int variable
        for(int o=0; o<x.length;o++){
        // linear method, goes through each slot
            if (x[o]==target){
                return o;
                // once this is true the method finishes and returns the index
            }
        }
        return -1;
        // if target int is not found it will return this int
    }

    public static void main(String[]args){
        LinearSearch ls = new LinearSearch();
        // linearsearch class instance so we can access the sorted list
        OneThousandSortedRandomNumbers otsrn = new OneThousandSortedRandomNumbers();
        // this class instance so we can access the method

        int x = ls.linearSearch(otsrn.getSortedArray(),7250);
        int y= ls.linearSearch(otsrn.getSortedArray(),9463);
        int z= ls.linearSearch(otsrn.getSortedArray(),1137);
        int a= ls.linearSearch(otsrn.getSortedArray(),4837);
        // set each method, which is returning the index for each of the target ints, to a variable

        System.out.println(x + " " + y + " " + z + " " + a);
        // print each index together
    }
}