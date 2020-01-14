import java.util.Scanner;
public class SpellingBeeSimulator{
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = myScan.nextLine();
        System.out.println(word);
        for(int i = 0; i<word.length(); i++){
            if (i<word.length()-1){
            System.out.print(word.substring(i,i+1)+ "-");}
            else {
            System.out.println(word.substring(word.length()-1));}
        }
        myScan.close();
    }
}
/* I import the Scanner class first. I made a Scanner object and set a string variable to
the user's input. A prompt string is printed. Next, that word is printed out. Then I use a 
for loop statement, setting, a int 1 to zero and with the requirements i must be bellow the 
int number of characters in the user's word (I use the length method to do this comparasion) 
to run through each time and adding 1 to i after each time through. In the for statement, I
have an if statement so for the word it can be broken down into the letters that are not the
final letter of the word (doing this to avoid a dash.) So the requirements for the if 
statement are that i is bellow 1 less of the word length. If not (so only when i is equal to 
length), it will be true to the else statement. Then I close the myScan object. */