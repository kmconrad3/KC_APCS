
public class Phone{ 
    // create Phone class

    String brand;
    int batteryHours;
    String color;
    String provider;
    int year;
    // create variables that can be used all throughout the class

    public Phone(String brand, String color, String provider, int year){
        this.brand = brand;
        this.color = color;
        this.provider = provider;
        this.year = year;
        batteryHours = batteryFind(year);
        /* making phone constructor and setting the instance variables 
        to the previously defined variables so they can be used further */
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

    public void messages(){
        int messages = (int) (Math.random()*10);
        System.out.println("You have " + messages + ".");
        // another method needing no parameters, it randomly gives out an int of how many messages the created phone has
    }

    public static void main(String[]args){}
    // every class needs a main method, this one isn't intented to do something though
}