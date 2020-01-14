import java.util.Scanner;

public class BasicNestedPractice{

    public static void main(String[]args){

        Scanner myScan = new Scanner(System.in);
// create new scanner object
        System.out.println("Enter a letter:");
        String letter = myScan.nextLine();
        System.out.println("Enter the number of how many rows you want:");
        int rows = myScan.nextInt();
        System.out.println("Lastly, enter the number of how mnay columns you want:");
        int columns = myScan.nextInt();
// use scanner method to hold imput into a string/int variable (3 times)

        if(columns<= 20 && rows<=20){
// if statement to make sure the input is not past the max length
            for(int i=1; i<= rows; i++){
// for statement that will continue until i reaches rows length
                for(int p=1; p<= columns; p++){
// this for statement will go across the length of columns
                    System.out.print(letter);
                }
            System.out.println();
// this indents to the next row
            }}

        else{
            System.out.println("Those lengths are not valid.");}
// else statement prints this if user enters to big/negative/decimals numbers
        
        myScan.close();
// close my scanner object
    }
}