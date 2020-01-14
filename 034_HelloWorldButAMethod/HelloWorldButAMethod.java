public class HelloWorldButAMethod{

    public static void hello(String x){
        System.out.println("Hello " + x);
    }
    public static void main(String[]args){
        hello("Word");
    }
}
/* I open the public cass with name identical to file like usual. However, before I 
open the main (which runs the program basically), I creat a public object hello in the
public class. It requires a string parameter. Then it prints the variable with hello.
I open the main and call the oblect putting a string inside. */