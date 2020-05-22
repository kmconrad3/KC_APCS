import java.util.*;

public class GuessMyWordInsertion{
    static String guess; 

    public static void insertSort(ArrayList<String> arr){
        // the method that will be doing the insertion sorting, int arr parameters needed
        for(int i=1; i<arr.size(); i++){
            // for loop to go through each array slot
            String hold = arr.get(i);
            // value at index i
            int j= i-1;
            // index before i to be used for comparison
            while(j >= 0 && hold.compareTo(arr.get(j)) > 0){
                /* in order for the while loop instructions to execute j has to be bigger than -1 bc no negative indexs
                and the value at index j much be bigger than value at index i */
                arr.set(j + 1, arr.get(j));
                // replaces the slot after j with the current j value since it is larger
                j--;
                // makes j the slot below what it currently is which is then compared to values at i 
         
            }
            arr.set(j + 1, hold);
            /* while loop stops when value at j is less than hold, so this updates the slot right after j (which has been
            changed by the while loop) to whatever the hold value is */
        }
    }

    public static void reverseInsertSort(ArrayList<String> arr){
        for(int i = 1; i < arr.size(); i++){
            String hold = arr.get(i);
            int j = i - 1; 
            while(j >= 0 && hold.compareTo(arr.get(j)) < 0){
                //wants hold to be after j value this time (compareto method would return negative number)
 
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, hold);
        }
        // does exact same thing as insertSort method except backwards
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
            if(guess.compareTo(answer) < 0){
                front.add(guess);
                // adds guess to the string arraylist alphabetically before answer
            }
            else if(guess.compareTo(answer) > 0){
                back.add(guess);
                // adds guess to the string arraylist alphabetically after answer
            }
            else{
                System.out.println("You did it!");
                break;
                // pretty much checks if any guesses after the first one are the answer, if so the loop ends
            }
            
            insertSort(front);
            reverseInsertSort(back);
            // uses the method already created to sort through each arraylist of guesses

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