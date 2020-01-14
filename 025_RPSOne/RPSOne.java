import java.util.Scanner;

public class RPSOne{
    public static void main(String[]args){
    
        System.out.println("Rock Paper Scissors shoot! *enter your choice*");
        Scanner myScan = new Scanner(System.in);
        String user = myScan.nextLine();
        double computerNum = Math.random();
        String compAns;
      
        if (computerNum<= .3333){
            compAns = "rock";
        }
        else if (computerNum > .3333 && computerNum<= .6666){
            compAns = "paper";
        }
        else {
            compAns = "scissors";
        }

        if (user.equals(compAns)){
            System.out.println("This round is a tie.");
        }
        else if (user.equals("rock") && compAns=="scissors"){
            System.out.println("Scissors beats rock, you lose!");
        }
        else if (user.equals("rock") && compAns=="paper"){
            System.out.println("Paper beats rock, you lose!");
        }
        else if (user.equals("scissors") && compAns=="paper"){
            System.out.println("Scissors beat paper, you win!");
        }
        else if (user.equals("scissors") && compAns=="rock"){
            System.out.println("Rock beats scissors, you lose!");
        }
        else if (user.equals("paper") && compAns=="scissors"){
            System.out.println("Scissors beats paper, you lose!");
        }
        else if (user.equals("paper") && compAns=="rock"){
            System.out.println("Paper beats rock,you win!");
        }
        else {
            System.out.println("You entered an invalid option. Run again.");
        }
        myScan.close();
    }
}
/* Imported Scanner class and created a new object. I used Math.random() to split up evenly, with an if
statement, a way for computer to randomly chose rock, paper or scissors set to a String variable.
Than I use another if statement to compare the users input (which I called the user to enter 
into the console, equaled to a string variable) with the computers variable. If the input does
not fit any of the if and else if statments then the else statement just prints out the user
inputed a wrong answer. Lastly, I closed myScan object. */