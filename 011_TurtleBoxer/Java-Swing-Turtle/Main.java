import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main 
{
  public static void main(String[] args) 
  {

    World w = new World(220,220);
    Turtle bub = new Turtle(w);

    bub.forward();
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.forward(200);
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.penUp();
    bub.forward(100);
    bub.penDown();
    bub.forward();
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.penUp();
    bub.forward(200);
    bub.penDown();
    bub.turnRight();
    bub.forward();
    bub.turnRight();
    bub.forward();
  
  w.setVisible(true);

  }
}
/* I downloaded all the classes in the Java-Swing-Turtle folder so when I write 
code, the computer will know what to do with some of the classes.methods, parameters and etc. 
Then I open the class that I am using (Main) followed by the PSVMSA. Next I construct
a object of the World class. Then an object of Turtle (parameter = world). From there
I give turtle methods to follow with dot notation to create the 4 squares. Lastly, I 
call a method onto w with the parameter true because it is a boolean. True means the method
setVisible will follow throught. Then closed the code with proper brackets. */