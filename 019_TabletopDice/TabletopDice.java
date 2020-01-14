public class TabletopDice
{
    public static void main(String[]args)
    { 

    int diceFour = (int) (Math.random()*4)+1;
    int diceSix =  (int) (Math.random()*6)+1;
    int diceEight = (int) (Math.random()*8)+1;
    int diceTen = (int) (Math.random()*10)+1;
    int percentile = (int) ((Math.random()*10)+1)*10;
    int diceTwelve = (int) (Math.random()*12)+1;
    int diceTwenty = (int) (Math.random()*20)+1;

    System.out.println(percentile); 
    System.out.println(diceFour);
    System.out.println(diceSix);
    System.out.println(diceEight);
    System.out.println(diceTen);
    System.out.println(diceTwelve);
    System.out.println(diceTwenty);
    }
}
/* Open public class w PSVMSA. Then I define 7 variable (as ints) to be each of my dice. I use java's
math class function random to act as the rolling dice. Then depending on what type of dice, I use 
similar math operators to give me numbers (of the dice) I want. Then I print each dice out and close
with proper brackets like the start. */




