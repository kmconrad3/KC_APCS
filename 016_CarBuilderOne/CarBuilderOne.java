import java.util.Scanner;

public class CarBuilderOne
{
    public static void main(String[]args)
    {
        int year;
        int mileage;
        String make;
        String model;

        Scanner myScan = new Scanner(System.in);
        System.out.println("What car brand are you looking for? ");
        make = myScan.nextLine();
        System.out.println("Alright, what model? ");
        model = myScan.nextLine();
        System.out.println("Okay, any specific year? ");
        year = myScan.nextInt();
        System.out.println("Lastly, how much milage are you thinking? ");
        mileage = myScan.nextInt();
        System.out.println("Alright I will go see if we have this car. One moment please.... *Time passing*");

        Car findCar = new Car(year,mileage,make,model);

        System.out.println("Good news! We found the exact car; " + findCar.manufacturerName + " " + findCar.modelName + " " + findCar.year + " with " + findCar.milesDriven + " miles!");
        
        myScan.close();
    }
}
/* First import the scanner class from java. Then open my class with file name followed by PSVMSA. Next, I define my variables,
and create a new scanner. Followed, I print out prompts and after each, I set a variable that will collect what the user inputs 
and saves it. Then I create a new car with the parameters of the variables that the user has input. Then I print out a statement
while concatinating the same input values but taken from the findCar I made. The statements just says that we have the car with
 all the specifics. Lastly, I close my scanner and the program with proper brackets. */