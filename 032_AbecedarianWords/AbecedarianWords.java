import java.util.Scanner;

public class AbecedarianWords{
    public static void main(String[]args){

    Scanner myScan = new Scanner(System.in);
    // make new scanner object
    System.out.println("Enter any word:");
    // print prompt
    String word= myScan.nextLine();
    // string variable holds user imput

    for(int i=0; i<word.length()-1;i++){
    // for loop goes until i gets to last word letter
        String firstLetter= word.substring(i);
        // first letter
        String secondLetter = word.substring(i+1);
        // second letter
        int compare = firstLetter.compareToIgnoreCase(secondLetter);
        // int variable contains value of the two letters compared with a string method
            if (compare<=0){}
            // if statement, if true will carry on if not will add length to stop loop
            else if (compare>0){
                System.out.println("This is not an abecedarian word.");
                i += word.length();}

            if (i==word.length()-2){
            // get to this point/end it will print that it is abecedarian
                System.out.println("This is an abecedarian word.");}
                
        }
    
    myScan.close();
    // close scanner
    }
}