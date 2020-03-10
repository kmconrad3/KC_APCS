import java.util.*;
// import all so I can use scanner and arraylist
public class AverageOfDice{

    int side;
    int total;
    // public variables that I can use in main

    ArrayList<Integer> rolls = new ArrayList<Integer>();
    // initialize arraylist

    public int diceRoller(){
        side= (int) (Math.random()*100+1);
        return side;
        // method to roll a side, returns the side which is an int
    }

    public ArrayList allRolls(int side){
        this.side=side;
        // this generic side now equal to the one from the previous method
        rolls.add(side);
        return rolls;
        // parameters an int, and add that number into my arraylist, return type the updated arraylist
    }

    public double average(ArrayList<Integer> rolls){
        this.rolls=rolls;
        // generic roll arraylist to the one I already created
        for(Integer x : rolls){
            total=+ x;
            // enhanced loop accessing values to add up to total
        }
            return (double) (total/rolls.size());
            // return the average equation using the size of the parameter arraylist
        }
    

public static void main(String[]args){
    AverageOfDice ad = new AverageOfDice();
    // class instance of AverageOfDice so I can access my methods

    Scanner myScan = new Scanner(System.in);
    String hey;
    // create both of these so I can get a response

    System.out.println(ad.average(ad.allRolls(ad.diceRoller())));
    // role first time once

    boolean go = true;
    while (go==true){
    // while loop will go until go variable = false

        System.out.println("Would you like to role again?");
        hey = myScan.nextLine();
        // get users response to continue
        
        if (hey.equals("yes")){
            System.out.println(ad.average(ad.allRolls(ad.diceRoller())));
            go=true;
            // if yes, go remains true and the loop will carry on
        }
        else{
            go=false;
            // if they say no (expected), will change go variable to false so loop ends
        }
    }

myScan.close();
// close scanner

}
}