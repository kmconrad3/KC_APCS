import java.util.Scanner;

public class UsingThePhone{

    public static void main(String[]args){
        
        Scanner myScan = new Scanner(System.in);

        String brand;
        int batteryHours;
        String color;
        String provider;


        System.out.println("Enter the brand of your phone: ");
        brand = myScan.nextLine();
        System.out.println("Enter your phones color: ");
        color = myScan.nextLine();
        System.out.print("Enter your phones provider: ");
        provider = myScan.nextLine();
        
        Phone myCell = new Phone(brand, batteryHours, color, provider, year);
        myCell.batteryFind();

        myCell.messages();
    } 
}