public class RefactorATableOfVariables
{
    public static void main(String[]args)
    {
        int rowOneOne = 1;
        int rowTwoOne = 2;
        int rowThreeOne = 3;
        int rowFourOne = 4;
        int rowOneTwo = rowOneOne*rowOneOne;
        int rowTwoTwo = rowTwoOne*rowTwoOne;
        int rowThreeTwo = rowThreeOne*rowThreeOne;
        int rowFourTwo = rowFourOne*rowFourOne;
        int rowOneThree = rowOneOne*rowOneOne*rowOneOne;
        int rowTwoThree = rowTwoOne*rowTwoOne*rowTwoOne;
        int rowThreeThree = rowThreeOne*rowThreeOne*rowThreeOne;
        int rowFourThree = rowFourOne*rowFourOne*rowFourOne;

        System.out.println("a a^2 a^3"); 
        System.out.println(rowOneOne + " " + rowOneTwo + " " + rowOneThree); 
        System.out.println(rowTwoOne + " " + rowTwoTwo + " " + rowTwoThree);
        System.out.println(rowThreeOne + " " + rowThreeTwo + " " + rowThreeThree);
        System.out.println(rowFourOne + " " + rowFourTwo + " " + rowFourThree);
    }
}
/* I opened public class and then PSVMSA. Set first column to a variable. Then for the next two columns I made variables 
caling the first colum variables back, using math to do the next column. Then I printed 3 lines calling each column 
in the correct order. Then closed the code with } brackets. */
