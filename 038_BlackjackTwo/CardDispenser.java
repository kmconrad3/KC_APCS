import java.util.Scanner;

public class CardDispenser{

int total;

    public int getCard(){
    int firstTwo = Math.random();

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

    }

    public hit(int total){
        this.total = total;
        Scanner myScan = new Scanner(System.in);
        boolean hit;

        while (hit == true){

        System.out.println("Would you like to hit or keep your total of " + total + ";");
        String response = myScan.nextLine();

        if (response.compareTo("hit")){
            total += getCard();
                if (total>=21){
                }
                else{}
            hit = true; 
        }
        else if (response.compareTo("keep")){
            hit = false;
        }
        else {
            System.out.println("You've entered an invalid command. Try again please. ");
            
        }





            }
        }
    }


