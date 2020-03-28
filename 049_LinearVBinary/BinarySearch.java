public class BinarySearch{

    public int binarySearch(int[] x, int target){
        // requires an int array and target int variable
        int l=0;
        // for index all the way at the start
        int r=x.length -1;
        // for the very last index of any array
        while (l<=r){
        // goes through until the value is found
        int m= (l+r)/2;
        // changes as the bounds change each time while going through the loop
        if (target<x[m]){
            // if else statment changing the bounds to whatever the m value currently defined as
            r=m-1;
            }
            // m defines new upper bound
        else if (target>x[m]){
            l=m+1;
            }
            // m defines new lower bound
        else {
            return m;
            // eventually both bounds and middle value equal each other and for that to happen it is also the target
            }
        }
    return -1;
    // if target doesn't exist in array, the bounds will change to l>r, stopping the loop and have to return -1
    }

    public static void main(String[]args){
        BinarySearch bs = new BinarySearch();
        // linearsearch class instance so we can access the sorted list
        OneThousandSortedRandomNumbers otsrn = new OneThousandSortedRandomNumbers();
        // this class instance so we can access the method

        int x = bs.binarySearch(otsrn.getSortedArray(),7250);
        int y= bs.binarySearch(otsrn.getSortedArray(),9463);
        int z= bs.binarySearch(otsrn.getSortedArray(),1137);
        int a= bs.binarySearch(otsrn.getSortedArray(),4837);
        // set each method, which is returning the index for each of the target ints, to a variable

        System.out.println(x + " " + y + " " + z + " " + a);
        // print each index together
    }
}