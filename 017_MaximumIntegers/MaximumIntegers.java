public class MaximumIntegers
{
    public static void main(String[]args)
    {
        Integer min = new Integer(0);
        min = min.MIN_VALUE;

        Integer max = new Integer(0);
        max = max.MAX_VALUE;

        Integer sevenNum = new Integer(0);
        sevenNum = min - 2146483648;

        Integer threeNum = new Integer(0);
        threeNum = max - 2147482902;


        System.out.println(min);
        System.out.println(max);
        System.out.println(sevenNum);
        System.out.println(threeNum);
    }
}
/* Open a public class w same file name with PSVMSA. Use Integer class and make four objects of it. Next I
define the object to itself with one of it's functions on itself (did this for min and max value). Then 
similarly, I make the next 2 objects equal to the previous objects and then a simple math opperation. 
Lastly, I print out each object/variable. */