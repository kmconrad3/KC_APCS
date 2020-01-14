import java.util.Scanner;

public class LoanCalculator
{
    public static void main(String[]args)
    {
        double princBal;
        double anIntRate;
        double remain;

        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter your Principal Balance: ");
        princBal = myScan.nextDouble();
        System.out.print("Now please enter your Annual Interest Rate: ");
        anIntRate = myScan.nextDouble();
        System.out.print("Lastly, enter the remaining months on your loan: ");
        remain = myScan.nextDouble();

        double monthlyInterest = princBal * (anIntRate/remain);
        System.out.println("Your monthly interest is " + monthlyInterest);

        double monthlyPayment = (princBal/remain) + monthlyInterest;
        System.out.println("Your monthly payment is " + monthlyPayment);
        myScan.close();
    }
}
/* I import the scanner then open my class LoanCalculator. Next I do proper brackets
followed by PSMVA then brackets again. Then I create a Scanner object called myScan, as well as defining my 
variables to int that I will be storing responses in later. Then I print out various statements followed
by my variables = to the scanner int (because the input will be a number) object called onto
my Scanner. It will scan whatever the user inputs and then will store it. After the 3 inputs I ask for,
I define 2 other variables, double type, to math equations using the user inputs which are stored 
in my set variables. Then I print two statements concatinating the values of the two double varibles.
Then close the scanner after. Finally I close the program wth }s. */