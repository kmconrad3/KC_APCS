import java.util.Scanner;
public class DateTranslator{

int day;
int month;
int year;
// define these variables in the public class so it is not static

    public void printAmericanE(int x,int y, int z){ 
        System.out.print(x + "/" + y + "/" + z);
// create my method which will print the date in either American or European, depending on input order
    }

    public static void main(String[]args){
       
        Scanner myScan = new Scanner(System.in);
        DateTranslator dt = new DateTranslator();
// create new scanner object and datetranslator object to be able to call the objects from outside of public static

        System.out.print("What day is it?");
        dt.day = myScan.nextInt();
        System.out.println("What number month is it?");
        dt.month = myScan.nextInt();
        System.out.println("what year is it?");
        dt.year = myScan.nextInt();
        myScan.nextLine();
        System.out.println("What type of date abbreviation would you like? ");
        String type = myScan.nextLine();
// using dt to access the variables, I prompt user to enter date and type of print they want

        if (type.compareToIgnoreCase("american")==0){
            dt.printAmericanE(dt.month,dt.day,dt.year);
        }
        else if (type.compareToIgnoreCase("european")==0){
            dt.printAmericanE(dt.day,dt.month,dt.year);
        }
/* Using the now defined variables, we compare the type of date print they entered to 
american or european with the compareToIgnore object to the actual word. If it equals
0 then it's equal. This is done by an if statement. Depending on entry, when calling
my defined method, I change the order of the date parameters. */

        myScan.close();
// closed myScan object
    }
}