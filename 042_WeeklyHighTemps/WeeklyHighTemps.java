public class WeeklyHighTemps{
    int[] x;
    // pre define array
    public WeeklyHighTemps(int[] x){
        this.x=x;
        // making the class constructor, parameters is an array
    }
    public void getTemp(){
        for(int i : x )
        System.out.print(i + " ");
        // getter method with an enhanced for loop to print out each slot in the array
        
    }

    public static void main(String[]args){
        int[] hey= {33,27,34,18,11};
        WeeklyHighTemps hi = new WeeklyHighTemps(hey);
        // in main I make an array for the parameters of an instance of WeeklyHighTemps class 
        hi.getTemp();
        // then I use the getter method on my class object
    }
}