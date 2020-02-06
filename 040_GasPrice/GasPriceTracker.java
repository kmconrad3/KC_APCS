public class GasPriceTracker{
    private double price=0.0;
    private String name;
    // variables that can only be used in this class

    public GasPriceTracker(double price, String name){
        this.name = name;
        this.price = price;
        // making the constructor 
    }
    public String getName(){
        return name;
        // getter method to get around the private variable
    }
    public double getPrice(){
        return price;
        // getter method to get around the private variable
    }
    public static void main(String[]args){}
    // doesn't do anything but needed in every class
}