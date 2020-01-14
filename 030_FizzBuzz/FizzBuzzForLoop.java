import java.util.Scanner;
public class FizzBuzzForLoop{
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = myScan.nextInt();

        for (int i=1;i<= num;i++){
            if (i%3==0){
                if (i%5==0){
                    System.out.println("Fizzbuzz");
                }
                else {
                    System.out.println("Fizz");
                }
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        myScan.close();
    }
}
/* Made a scanner object after importing the Scanner class. Printed a prompt, whatever user enters
I set to an int variable. Using a for loop, I have an if statement (one of the statements having a 
second if statement). The for loop defines the int i which basically controls how many times the
statement loops (when below users input). I close my scanner at the end. */