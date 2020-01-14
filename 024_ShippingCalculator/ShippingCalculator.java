import java.util.Scanner;

public class ShippingCalculator{
    public static void main(String[]args)
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hello! What's the weight of your package in pounds?");
        double w = myScan.nextInt();

       if (w>0 && w<=1){
           System.out.println("The cost of your package is $3.50.");
       } 
       else if (w>1 && w<= 3){
           System.out.println("The cost of your package is $5.50.");
       }
       else if (w>3 && w<= 10){
           System.out.println("The cost of your package is $8.50.");
       }
       else if (w>10 && w<= 20){
           System.out.println("The cost of your package is $10.50.");
       }
       else if (w<0){
           System.out.println("Invalid input.");
       }
       else {
           System.out.println("This package cannot be shipped.");
       }
       myScan.close();
    }
}
/* I imported the Scanner class first. Then in the PSVMSA create a new scanner followed by 
a printed prompt telling the user to enter their package's weight. Their input is then
set to a double variable. Depending on what the variable is, I created an if else statement
to sort out what the price will be for any weight given. Once the program finds which statement
it is true to, it will print the price statement. I accounted for negaive and too big numbers also. */