public class CustomCalculatorRun{

    public static void main(String[]args){
        CustomCalculator cc = new CustomCalculator();
    cc.add(4,4);
    cc.divide(4,4);
    cc.subtract(4,4);
    cc.multiply(4,4);
    cc.square(4);
    cc.circleArea(4);
    cc.exponent(4,4);
    cc.remainder(4,4);
    }
}
/* Using the methods from the other file, which can work over here because I didn't use static. 
However I need to create a object of the other file inorder to call the methods from that file. */
