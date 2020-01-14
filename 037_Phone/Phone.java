import java.util.Scanner;

public class Phone{
    String brand;
    int batteryHours;
    String color;
    String provider;
    int year;

    Scanner myScan = new Scanner(System.in);

    public Phone(String brand, String color, String provider, int year, int batteryHours){
        this.brand = brand;
        this.batteryHours = batteryHours;
        this.color = color;
        this.provider = provider;
        this.year = year;
        batteryHours = batteryFind(year);
    }

    public batteryFind(int year) {
    
        if (year<=2000){
            return 5; }
        else if (year>2000 && year<=2010){
            return 7;}
        else if (year>2010 && year<=2015){
            return 10;}
        else if (year>2015){
            return 12;}
    }

    public void messages(){
        int messages = (int) (Math.random()*10);
        System.out.println("You have " + messages + ".");
    }

    public static void main(String[]args){}
}
