public class AHerdOfCats{
    Cat c = new Cat("Mittens",10);
    Cat b = new Cat("Ruby",2);
    Cat a = new Cat("Bink",5);
    // making three cat classes inserting their name and weights
    

        public void feedCat(Cat[] x){
            // method needing Cat type array parameter

            for(int i=0; i < x.length; i++){
                // for loop to go through the array of cats
                System.out.println(x[i].getName() + " is the cats name");
                System.out.println(x[i].getWeight() + " is the current weight");
                // use getter method from Cat
                System.out.println("I am feeding the cat a pound of fish");
                x[i].y =+ 1; 
                // altering the weight in the array
                System.out.println(x[i].getWeight() + " is now the cats weight");
                System.out.println();
            }
        }

    public static void main(String[]args){
        AHerdOfCats cats = new AHerdOfCats();
        // instance of AHeardOfCats so I can use the method
        Cat[] catz = {cats.c,cats.b,cats.a};
        // creating array of Cat type inserting the 3 Cats made in AHeardOFCats class
        cats.feedCat(catz);
        // call the method from cats with the array catz of Cats
    }
}