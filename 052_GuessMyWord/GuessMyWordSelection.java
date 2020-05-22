import java.util.*;
// import all so we can use arraylists

public class GuessMyWordSelection{
    static String guess;
    // is same variable for all class instances 

public static void selectionSort(ArrayList<String> x){
        for (int y = 0; y < x.size() - 1; y++){
         int min = y;
         //starting point for going through each array's slot

         for (int z = y + 1; z < x.size(); z++){
             // a second loop compares current first index value to all the slot values (it's job gets shorter each time)
            if (x.get(z).compareTo(x.get(y)) < 0){
               min = z;
               // which ever one is lowest is the whole array's lowest value
            }
         }
        String lol = x.get(y);
        x.set(y,x.get(min));
        x.set(min,lol);
        // here the outer loop switches the current y value with the min index's value, then carries on to the next slot
       }
    }

    public static void start(String answer){
        Scanner scan = new Scanner(System.in);
        // scan users guess
        ArrayList<String> front = new ArrayList<String>();
        ArrayList<String> back = new ArrayList<String>();
        // create 2 arraylists, one for guesses infront and behind answer
        System.out.println("Guess: ");
        guess = scan.nextLine();
        // prompts user to enter their guess
        while(guess != answer){
            // goes through if guess is not equal to answer
            guess = scan.nextLine();
            // stores guess to guess variable
            else if(guess.compareTo(answer) < 0){
                front.add(guess);
                // adds guess to the string arraylist alphabetically before answer
            }
            if(guess.compareTo(answer) > 0){
                back.add(guess);
                // adds guess to the string arraylist alphabetically after answer
            }
            else{
                System.out.println("You did it!");
                break;
                // prett much checks if any guesses after the first one are the answer, if so the loop ends
            }

            selectionSort(front);
            selectionSort(back);
            // uses these methods already created to sort through each arraylist of guesses

            System.out.println();
            System.out.println();
            System.out.println();
            // prints spaces to separate from last round's guesses

            for(String x : front){
                System.out.print(x + " \n");
            }
            System.out.println("\n Guess: \n");
            for(String x : back){
                System.out.print(x + " \n");
            }
            // each time through prints like a visual on the wesite game of the answer in between user's sorted guesses
        }
        if(guess == answer){
            System.out.print("You did it");
        }
        // when the user's guess is equal to answer the first round, this statement prints and the method is finished running
        scan.close();
        // close guesses scanner
    }


    public static void main(String args[]){
        start("cat");
        /* in main start method is called to begin game, parameter cat being the answer, 
        no need to call it off a class bc it's all static */
    }
}