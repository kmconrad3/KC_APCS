import java.util.Scanner;
public class FizzBuzzWhileLoop{
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = myScan.nextInt();
        int i = 1;
        while (i<= num){
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
            i++;
        }
        myScan.close();
    }
}
/* Made a scanner object after importing the Scanner class. Printed a prompt, whatever user enters
I set to an int variable. Using a while loop, I have an if statement (one of the statements having a 
second if statement). The while loop runs until the previously defined i variaable is bigger than
the user input value. In the paranthesis for the loop, the program will add 1 to i. At the end I
close my scanner at the end. */