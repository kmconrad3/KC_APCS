public class CustomCalculator{

    public void subtract(int x,int y){
        System.out.println(x-y);
    }
    public void add(int x, int y){
        System.out.println(x+y);
    }
    public void multiply(int x, int y){
        System.out.println(x*y);
    }
    public void divide(int x, int y){
        System.out.println(x/y);
    }
    public void square(int x){
        System.out.println(x*x);
    }
    public void remainder(int x, int y){
        System.out.println(x%y);
    }
    public void circleArea(int x){
        System.out.println(x*x*3.142);
    }
    public void exponent(int x, int y){
        int result=1;
        for (int i=0; i<= y; i++){
            result=x*result;
           }
        System.out.println(result);
    }
}
/* Open the public class with identical file. Then for each calculator method I am making I use the
initiator public void, then the name of my method with the parameters needed. Following is the action
that will be performed w the variables when called. */