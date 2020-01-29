import java.util.Scanner;
// need for scanner in hit object to carry over

public class Table{
    public static void main(String[]args){

        CardDispenser cd = new CardDispenser();
        // create an instance of the class

        int cardOne = cd.getCard();
        int cardTwo = cd.getCard();
        // get two cards for user to start with using get card method from card dispenser class
        cd.total = cardOne + cardTwo;

        System.out.println("You have a " + cardOne + " and a " + cardTwo + ". Your total value right now is: " + cd.total);
        // let them know what their current total is 
        while (cd.dealerCard <= 16){
            cd.dealerCard = cd.dealerCard + cd.getCard();
        // while statement to set the dealers value, condiition for it to loop is number must be lower than 16
        }

        System.out.println(cd.hit(cd.total));
        // print the hit method from card dispenser using total varaible accessible everywhere, which is returning a string
    }
}