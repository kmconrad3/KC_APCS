public class ComputeAnExpressionTwo
{
    public static void main(String[]args)
    {
        ReturningCalculator myCalc = new ReturningCalculator();
        double equation = myCalc.doubleMultiplier(9.5,4.5);
        double toSubtract = myCalc.doubleMultiplier(2.5,3);
        double bottom = myCalc.doubleSubtractor(45.5,3.5);

        System.out.println(myCalc.divider(myCalc.doubleSubtractor(equation,toSubtract),bottom));
    }
}
/* Open class with same name as file. Then followed by PSVMSA. Next, I open a new ReturningCalculator 
object. Then I do the same math equation fron 007 but for each variable I call a method from 
the ReturningCalculator class with dot notation. Then for the printed statement I use more methods with the variables
that are made up of ReturningCalculator as well. Then close program with proper brackets. */