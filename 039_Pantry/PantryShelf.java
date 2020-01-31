import java.util.Scanner;
// need for later

public class PantryShelf{
    FoodItem cookies = new FoodItem("cookies",10);
    FoodItem grapes = new FoodItem("grapes",20);
    FoodItem cheezits = new FoodItem("cheezits",15);
    FoodItem almonds = new FoodItem("almonds",12);
    // make fooditem instince objects in here so it is more fluidly accessible and flexibly for future commands

    public static void main(String[]args){
        PantryShelf ps = new PantryShelf();
       // create pantryshelf object to use the other classes made in there

        Scanner myScan = new Scanner(System.in);
        // create scanner object

        System.out.println("What would you like to eat?");
        String response = myScan.nextLine();
        // save their input into a int variable

        if (response.compareTo(ps.grapes.getName())==0){
               // if statements comparing the response to the different fooditem object names 
            System.out.println("How much of the grapes would you like to eat? There are currently " + ps.grapes.getAmount());
               // prompt them to say how much they want, also printing the current amount using a getter
            ps.grapes.eating = myScan.nextInt();
               // set input to previously instaniated public variable in fooditem class
                for (int i=ps.grapes.eating; i>0; i--){
                    System.out.println("I am eating " + i + " grapes.");
                }
                // for loop counting down from the eating variable amount, then print the number left to eat each time till 0
            ps.grapes.afterEat(ps.grapes.eating);
            // use this method to reset amount after eating
            System.out.println("You know have " + ps.grapes.getAmount() + " left.");
            // print how much now is left with getter !!same for all the food objects!!
        }
        else if(response.compareTo(ps.cheezits.getName())==0){
            System.out.println("How much of the cheezits would you like to eat? There are currently " + ps.cheezits.getAmount());
            ps.cheezits.eating = myScan.nextInt();
            for (int i=ps.cheezits.eating; i>0; i--){
                System.out.println("I am eating " + i + " cheezits.");
            }
            ps.cheezits.afterEat(ps.cheezits.eating);
            System.out.println("You know have " + ps.cheezits.getAmount() + "l eft.");
        }
        else if(response.compareTo(ps.cookies.getName())==0){
            System.out.println("How much of the cookies would you like to eat? There are currently " + ps.cookies.getAmount());
            ps.cookies.eating = myScan.nextInt();
            for (int i=ps.cookies.eating; i>0; i--){
                System.out.println("I am eating " + i + " cookies.");
            }
            ps.cookies.afterEat(ps.cookies.eating);
            System.out.println("You know have " + ps.cookies.getAmount() + " left.");
        }
        else if(response.compareTo(ps.almonds.getName())==0){
            System.out.println("How much of the almonds would you like to eat? There are currently " + ps.almonds.getAmount());
            ps.almonds.eating = myScan.nextInt();
            for (int i=ps.almonds.eating; i>0; i--){
                System.out.println("I am eating " + i + " almonds.");
            }
            ps.almonds.afterEat(ps.almonds.eating);
            System.out.println("You know have " + ps.almonds.getAmount() + " left.");
        }
        else{System.out.println("Sorry that is not in the pantry!");
        // if they enter something not in the pantery it will print this and not do anything else
        }
        
        myScan.close();

}}