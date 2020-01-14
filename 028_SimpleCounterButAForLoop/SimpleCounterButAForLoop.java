public class SimpleCounterButAForLoop{
    public static void main(String[]args){
        
        for(int i=0; i<=300; i++){
        System.out.println(i);
        }
        for(int q=300; q>=0; q--){
        System.out.println(q);
        }
        for(int t=4798; t>=4798 && t<=5324; t++){
        System.out.println(t);
        }
        /*for(int y=5324; y>=4798 && y<=5324; y--){
        System.out.println(y);
        }*/
    }
}
/* Using 4 for loops, I make the first 1 start w an int = 0 and to follow the loop until it's
equal to 300 by adding 1 to it each time. If the for statement is true, it will print the 
int value at that current point in the loop. Then I do basically the same thing but 
opposite but start at 300 and subtract, printing the int value each time, so counting down
from 300. Then I do the same thing with the ++ and -- but to count between 2 numbers by
having to requirements for the statement using &&. */