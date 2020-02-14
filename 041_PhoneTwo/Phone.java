public class Phone{ 
    // create Phone class

    String brand;
    int batteryHours;
    String color;
    String provider;
    int year;
    // create variables that can be used all throughout the class

    public Phone(){
        brand = "apple";
        batteryHours = 0;
        color = "black";
        provider = "verison";
        year = 2000;
        // default constructor if no parameters are entered
    }

    public Phone(String brand, String color, String provider, int year){
        this.brand = brand;
        this.color = color;
        this.provider = provider;
        this.year = year;
        batteryHours = batteryFind(year);
        /* making phone constructor and setting the instance variables 
        to the previously defined variables so they can be used further */
    }

    public Phone(String color){
        this.color = color;
        brand = "apple";
        batteryHours = 0;
        provider = "verison";
        year = 2000;
        // another phone constructor to adjust and take in the phone color parameter
    }

    public int batteryFind(int year) {
    
        if (year<=2000){
            return 5; }
        else if (year>2000 && year<=2010){
            return 7;}
        else if (year>2010 && year<=2015){
            return 10;}
        else if (year>2015){
            return 12;}
        else{
            return 3;}
            // created a method needing int parameter, it uses the set year from the phone class, involves if statement
        }

    public String toString(){
        return "The phone has; " + provider + " " + brand + " " + year + " " + color;
        // overloading the special toString method, redefining it
    }

    public static void main(String[]args){}
    // every class needs a main method, this one isn't intented to do something though
}