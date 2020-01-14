public class FlipACoin
{
    public static void main(String[]args)
    {
        double random = Math.random();
        String coin;
        if (random >.5){
            coin = "heads";
        }
        else {
            coin = "tails";
        }
        System.out.print("You flipped a " + coin + "!");
    }
}
/* I define a double type variable to the Math class method random. Then I use an
if statement to define the string previously created, coin, to equal heads if the
random number is bigger than .5. And for everything else, the else statement will
define coin to tails. Then I print out a statement saying what side it was flipped
with what ever the coin is equal to. */