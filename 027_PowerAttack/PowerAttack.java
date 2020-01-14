public class PowerAttack{

    public static void main(String[]args){
    int num = 0;
    int strength = 3;
     while (num <11){
     num = (int) (Math.random()*10 +1);
     System.out.println(num);
     num+= strength;
     }
     if (num >= 11){
         System.out.println(num);
         System.out.println("You have hit the monster!");
        }
    }
}
/* Created 2 int variables. Then I use a while statement if num (one of the previously 
defined variables) is less than 11, it is instructed to add num to the constant strenth
value which is 3. Also in the while statement, num is redefined to a random number 1-10 by
using the Math class object random. Then once the num value no longer is true to the 
while statement, it will go down and print true to the if statement. Printing the final
attack roll and that the monster has been hit. */