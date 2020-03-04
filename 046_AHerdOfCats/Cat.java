public class Cat{
// cat class 
    String x;
    int y;
    // public variables so can be used in methods and all over

    public Cat(String x, int y){
        this.x=x;
        this.y=y;
        // class constructor needing parameters of one string and one int
    }
    
    public String getName(){
        return x;
        // return method for name
    }

    public int getWeight(){
        return y;
        // return method for weight
    }

    public static void main(String[]args){}
    // doesn't do anything but I need it
}