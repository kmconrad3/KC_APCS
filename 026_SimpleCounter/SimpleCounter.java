import java.util.Scanner;
public class SimpleCounter{
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int user = myScan.nextInt();
        int i = 0;

        while(i<=user){
            System.out.println(i);
            i++;
        }
        myScan.close();
    }
}
/* I imported the java class then in the program, I created a Scanner object. Next I prompted the
user to imput any number which is set to a int variable. I also created an int variablie = 0. 
After, I use a while loop, it will print the statement in the loop until the conditions are no 
longer true. As long as i is less or equal to the users number, it will print the counted value
starting w i being 0, and then add one each time. Finally, I close myScan. */