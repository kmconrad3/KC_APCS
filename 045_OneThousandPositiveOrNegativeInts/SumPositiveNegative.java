public class SumPositiveNegative{

        int totaln=0;
        int totalp=0;
        // will use and method and can be accessed anywhere

    public void sum(int[]x)
    {
        // method to do what the prompt wants, parameters are an array

        for(int i=0;i<x.length;i++){
            // for loop to go through each slot in the array
            if (x[i]<0){
                // if statement to see if the slop number is negative or positive
                totaln =+ x[i];
                // for both the if and else, it will at to the previously set int for total
            }
            else{ 
                totalp =+ x[i];
            }
        }
    }


    public static void main(String[]args){
        OneThousandPositiveOrNegativeInts otponi = new OneThousandPositiveOrNegativeInts();
        SumPositiveNegative spn = new SumPositiveNegative();
        // instance of the class above and the one where I can access the array for this prompt
        
        spn.sum(otponi.getOneThousandPositiveOrNegativeInts());
        // call the method sum from the above class onto the array

        System.out.println(spn.totaln);
        System.out.println(spn.totalp);
        // print both total variables after the method has altered them
    }
}