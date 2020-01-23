import java.util.Scanner;
// import scanner class for later

public class UsingThePhone{
// open class where I will actually use and create a Phone
    
public static void main(String[]args){
        
        Scanner myScan = new Scanner(System.in);
        // creating my scanner object

        String brand;
        int year;
        String color;
        String provider;
        // varibles already initiated up here

        System.out.println("Enter the brand of your phone: ");
        brand = myScan.nextLine();
        System.out.println("Enter your phones color: ");
        color = myScan.nextLine();
        System.out.println("Enter your phones provider: ");
        provider = myScan.nextLine();
        System.out.println("Enter the year your phone was made: ");
        year = myScan.nextInt();
        // using myScan, the user can import the details into variables of their phone 
        
        Phone myCell = new Phone(brand, color, provider, year);
       // creating a new phone object

        int battery= myCell.batteryFind(year);
        // calling one of the previously defined methods of phone class, set it to variable to print after

        System.out.println(battery + " hours battery capability.");
        
        myCell.messages();
        // calling one of the previously defined methods of phone class

        myScan.close();
        // close myScan object
    } 
}