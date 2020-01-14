import java.util.Scanner;

public class YetAgainRefactorATableOfVariables
{
    public static void main(String[]args)
    {
        Scanner myScan = new Scanner(System.in);

        int rowOneOne = 1;
        int rowTwoOne = 2;
        int rowThreeOne = 3;
        int rowFourOne = 4;
        double rowOneTwo = Math.pow(rowOneOne,2);
        double rowTwoTwo = Math.pow(rowTwoOne,2);
        double rowThreeTwo = Math.pow(rowThreeOne,2);
        double rowFourTwo = Math.pow(rowFourOne,2);
        double rowOneThree = Math.pow(rowOneOne,3);
        double rowTwoThree = Math.pow(rowTwoOne,3);
        double rowThreeThree = Math.pow(rowThreeOne,3);
        double rowFourThree = Math.pow(rowFourOne,3);

        System.out.println("a a^2 a^3"); 
        System.out.println(rowOneOne + " " + rowOneTwo + " " + rowOneThree); 
        System.out.println(rowTwoOne + " " + rowTwoTwo + " " + rowTwoThree);
        System.out.println(rowThreeOne + " " + rowThreeTwo + " " + rowThreeThree);
        System.out.println(rowFourOne + " " + rowFourTwo + " " + rowFourThree);

        System.out.print("Which row would you like to see now? ");
        int rowWant = myScan.nextInt() - 1;
        double columnTwo = Math.pow(rowWant,2);
        double columnThree = Math.pow(rowWant,3);

        System.out.println(rowWant + " " + columnTwo + " " + columnThree);
        myScan.close();
    }
}
/* I import the Scanner class and then open the public class with file name and PSVMSA. Next, I create a new
object in the class called myScan. Next I define lots of int and double variables. After the first 4, in 
the variable I call the function pow from Math (which is given from java). I use the previously defined variables
and the power from the table I want as the parimeters. After all that, I print out the actual table with 
concatination. Next I print a prompt and then set a variable to whatever the user inputs, with -1 because
the first row is just the column titles. Then with thatint they put in I do the same Math function, pow,
to the variable of their input. Then I print out that full row and close my scan object. */
