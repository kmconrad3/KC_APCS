public class AverageDiceRoll{
    OneThousandDiceRolls otdr = new OneThousandDiceRolls();
    // class instance of one OneThousandDiceRolls

    public double average(){
        // making a method with double return type
        int[]x= otdr.getDiceRolls();
        // using previous class object and method in there, I define this array to a varriable
        int total=0;
        // will be using this later
        for(int i=0; i<x.length; i++){
            total += x[i];}
            // for loop that at each slot in the array, it adds to total, i is what moves through the array
        return total/100;
        // to find average
    }

    public static void main(String[]args){
        AverageDiceRoll adr = new AverageDiceRoll();
        System.out.println(adr.average());
        // in main I create a class instance of AverageDiceRoll so I can access my average class then print what is returned
    }
}