import java.util.*;
// import all so arraylist can be used
public class CleanTempSensorData{

public ArrayList<Integer> templist = new ArrayList<Integer>();
   // a public array that will story the cleaned data and can be accessed anywhere
    
    public ArrayList cleaner(int[] x){
        // method that does the cleaning, parmeter type is an array
        for (int y : x){
            // goes through each index of the array
            if (y<20){
                templist.add(y);
                // if the array's values are below 20 (expected temp max), they're added to an arraylist
                
             }
        }
        return templist;
        // method returns the cleaned data which is all stored in arraylist templist
    }

    public static void main(String[]args){

        SensorData sd = new SensorData();
        // create class instance of SensorData so we can access the data array
        CleanTempSensorData ctsd = new CleanTempSensorData();
        // instance of this files class so we can use the cleaner method
        ArrayList<Integer> hey= ctsd.cleaner(sd.getTempSensorData());
        // method returns non-static templist, set that to a new arraylist variable
        System.out.println(hey);
        // print that static arraylist which stores all the clean data

    }
}