import java.util.Scanner;
// import because I will make a scanner object later
public class CardDispenser{

int total;
int dealerCard;
// in this class I set 2 variables to be used throughout the class anywhere

    public int getCard(){
    // return type is int for my card method I defined
    double firstTwo = Math.random();

        if (firstTwo <=.1){
            if (firstTwo <= .5){
                return 1;
            }
            else {return 11;}
        }
        else if (firstTwo> .1 && firstTwo<=.2){
            return 2;
        }
        else if (firstTwo> .2 && firstTwo<=.2){
            return 3;
        }
        else if (firstTwo>.3 && firstTwo<=.4){
            return 4;
        }
        else if (firstTwo> .4 && firstTwo <=.5){
            return 5;
        }
        else if (firstTwo> .5 && firstTwo<=.6){
            return 6;
        }
        else if (firstTwo> .6 && firstTwo<=.7){
            return 7;
        }
        else if (firstTwo> .7 && firstTwo<=.8){
            return 8;
        }
        else if (firstTwo> .8 && firstTwo<=.9){
            return 9;
        }
        else {
            return 10;
        }

        // if else statement along with random math method to random return a card value

    }

    public String hit(int total){
        // a second method that basically does the rest of the game work, return type string
        this.total = total;
        Scanner myScan = new Scanner(System.in);
        boolean hit=true;
        // I need a boolean variable, a scanner and the parameter (an int) to be defined as the previously made total variable
        while (hit == true){

       System.out.println("Would you like to hit or keep your total of " + total + "?");
        String response = myScan.nextLine();
        // I use scanner to set string response to the users input for what action they want

        if (response.compareTo("hit")==0){
        // in the while loop I use an if else statement, if they hit it goes into a second if statement after calling the getCard method to add to total
            total += getCard();
                if (total>21){
                    hit = false;
                    System.out.println("Your number is over 21. It is " + total + ".");
                }
        }
        else if (response.compareTo("keep")==0){
            hit = false;
        }
        else {
            System.out.println("You've entered an invalid command. Try again please.");
        
            myScan.close();
        // I manipulate hit to false when the person is either over 21 or press keep, this breaks the loop
    
        }}

        
        System.out.println("The dealers value is " + dealerCard + ".");
        // finally reveal the dealers value in print statement

        if (total > dealerCard){
            return "Congrats, you won!";}
        else if (total < dealerCard){
            return "Sorry, you lost.";}
        else if (dealerCard>21){
            return "You win! The dealers told was over 21 being " + dealerCard;}
        else {
            return "A tie! You both have " + total;}
        // after the loop there is yet another if else statement comparing the values of user and dealers cards and returning a string to say who won
        }

        public static void main(String[]args){}
        // PSVMSA is needed for every class, it doesn't do anything in this instance
}

