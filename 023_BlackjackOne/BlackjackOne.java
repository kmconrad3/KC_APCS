import java.util.Scanner;

public class BlackjackOne
{
    public static void main(String[]args)
    {
       double firstTwo = Math.random();
       int theCard;
    
       if (firstTwo <=.1){
           theCard = 0;
            System.out.println("Your first card is an Ace.");
       }
       else if (firstTwo> .1 && firstTwo<=.2){
           theCard = 2;
           System.out.println("Your first card is a Two.");
       }
       else if (firstTwo> .2 && firstTwo<=.2){
           theCard = 3;
           System.out.println("Your first card is a Three.");
       }
       else if (firstTwo>.3 && firstTwo<=.4){
           theCard = 4;
           System.out.println("Your first card is a Four.");
       }
       else if (firstTwo> .4 && firstTwo <=.5){
           theCard = 5;
           System.out.println("Your first card is a Five.");
       }
       else if (firstTwo> .5 && firstTwo<=.6){
           theCard = 6;
           System.out.println("Your first card is a Six.");
       }
       else if (firstTwo> .6 && firstTwo<=.7){
           theCard = 7;
           System.out.println("Your first card is a Seven.");
       }
       else if (firstTwo> .7 && firstTwo<=.8){
           theCard = 8;
           System.out.println("Your first card is an Eight.");
       }
       else if (firstTwo> .8 && firstTwo<=.9){
           theCard = 9;
           System.out.println("Your first card is a Nine.");
       }
       else {
           theCard = 10;
           if (firstTwo>.9 && firstTwo<= .933333){
               System.out.println("Your first card is a Queen.");
           }
           else if(firstTwo>9.33333 && firstTwo<= .9666666){
               System.out.println("Your first card is a King.");
           }
           else {
               System.out.println("Your first card is a Jack.");
           }
       }

       
       double second = Math.random();
       int theCardTwo;

       if (second <=.1){
           theCardTwo = 0;
            System.out.println("Your second card is an Ace.");
       }
       else if (second> .1 && second<=.2){
           theCardTwo = 2;
           System.out.println("Your second card is a Two.");
       }
       else if (second> .2 && second<=.2){
           theCardTwo = 3;
           System.out.println("Your second card is a Three.");
       }
       else if (second>.3 && second<=.4){
           theCardTwo = 4;
           System.out.println("Your second card is a Four.");
       }
       else if (second> .4 && second <=.5){
           theCardTwo = 5;
           System.out.println("Your second card is a Five.");
       }
       else if (second> .5 && second<=.6){
           theCardTwo = 6;
           System.out.println("Your second card is a Six.");
       }
       else if (second> .6 && second<=.7){
           theCardTwo = 7;
           System.out.println("Your second card is a Seven.");
       }
       else if (second> .7 && second<=.8){
           theCardTwo = 8;
           System.out.println(" Your second card is an Eight.");
       }
       else if (second> .8 && second<=.9){
           theCardTwo = 9;
           System.out.println("Your second card is a Nine.");
       }
       else {
           theCardTwo = 10;
           if (second>.9 && second<= .933333){
               System.out.println("Your second card is a Queen.");
           }
           else if(second>.933333 && second<= .9666666){
               System.out.println("Your second card is a King.");
           }
           else {
               System.out.println("Your Second card is a Jack.");
           }
       }
       Scanner myScan = new Scanner(System.in);
       System.out.println("Do you want to hit or stay?");
       String answer = myScan.nextLine();
       int stayVal;

       if (answer.equals("stay")){
            if (theCard==0){
                System.out.println("Would you like your Ace to be worth 1 or 11?");
                int aceValue = myScan.nextInt();
                if (aceValue==1){
                    theCard = 1;}
                else{
                    theCard = 11;}
            }
            else if (theCardTwo==0){
                System.out.println("Would you like your Ace to be worth 1 or 11?");
                int aceValue = myScan.nextInt();
                if (aceValue==1){
                    theCardTwo = 1;}
                else{
                    theCardTwo = 11;}
            }
            else {
            }
            stayVal = theCard + theCardTwo;
            System.out.println("Your cards value is " + stayVal);
       }

       else {
        double third = Math.random();
        int theCardThree;
     
        if (third <=.1){
            theCardThree= 0;
             System.out.println("Your third card is an Ace.");
        }
        else if (third> .1 && third<=.2){
            theCardThree = 2;
            System.out.println("Your third card is a Two.");
        }
        else if (third> .2 && third<=.2){
            theCardThree = 3;
            System.out.println("Your third card is a Three.");
        }
        else if (third>.3 && third<=.4){
            theCardThree = 4;
            System.out.println("Your third card is a Four.");
        }
        else if (third> .4 && third <=.5){
            theCardThree = 5;
            System.out.println("Your third card is a Five.");
        }
        else if (third> .5 && third<=.6){
            theCardThree = 6;
            System.out.println("Your third card is a Six.");
        }
        else if (third> .6 && third<=.7){
            theCardThree = 7;
            System.out.println("Your third card is a Seven.");
        }
        else if (third> .7 && third<=.8){
            theCardThree = 8;
            System.out.println("Your third card is an Eight.");
        }
        else if (firstTwo> .8 && firstTwo<=.9){
            theCardThree = 9;
            System.out.println("Your third card is a Nine.");
        }
        else {
            theCardThree = 10;
            if (third>.9 && third<= .933333){
                System.out.println("Your third card is a Queen.");
            }
            else if(third>9.33333 && third<= .9666666){
                System.out.println("Your third card is a King.");
            }
            else {
                System.out.println("Your third card is a Jack.");
            }
        }
       stayVal = theCard + theCardTwo + theCardThree;
       System.out.println("Your cards value is " + stayVal);
        }  
    int dealerOne = (int)(Math.random()*10)+1;
    int dealerTwo = (int)(Math.random()*10)+1;
    if (dealerOne <= .05){
        dealerOne=1;}
    else if (dealerTwo<= .05){
        dealerTwo=1;
    }
    else if (dealerOne > .05 && dealerOne <= .1){
        dealerOne =11;
    }
    else if (dealerTwo > .05 && dealerTwo <= .1){
        dealerTwo =11;
    }
    else{}
    int dealerTotal = dealerOne + dealerTwo;
    System.out.println("The dealers value is " + dealerTotal);
    if (dealerTotal>= stayVal){
        System.out.print("You lose!");}
    else{
        System.out.println("You win!");}
    
        myScan.close();
    }
}
/* I used a ton of if statements some inside each other to define the random numbers I called from
the Math object to define what each players card is. I did the same, adding a scanner object, and 
depending on the users input they could choose to hit or stay and what their ace value. Lastly, an
if statement was used to determine the highest score between the dealer and user to say the winner. */
