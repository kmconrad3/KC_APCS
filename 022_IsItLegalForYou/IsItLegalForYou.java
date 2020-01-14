import java.util.Scanner;

public class IsItLegalForYou
{
    public static void main(String[]args)
    {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Hi what's your age? ");
        int age = myScan.nextInt();

        if ( 16 <= age && age< 18){
            System.out.println("You can get a drivers license.");
        }
        else if (18 <= age && age< 21){
            System.out.println("You can get a drviers license, buy cigarettes and go to the casino.");
        } 
        else if (age >= 21){
            System.out.print("You can get a drviers license, buy cigarettes, go to the casino, rent a car and buy alcohol.");
        }
        else {
            System.out.print("You cannot get a drviers license, buy cigarettes, go to the casino, rent a car and buy alcohol.");
        }
        myScan.close();
    }   
}
/* I imported the scanner class and create a new scanner object. I print the prompt. Then
set a int variable equal to what the user will input using the nextInt method. That number
is then stored into age. I use an if statement using 2 requirements for the first two 
statements so they are in between the number range I want. Depending on what the age number is,
The if statement will find which if/else if/else piece it is true to and print the statement
I have for it to print out if that piece is true. Lastly, I close (method) myScan. */