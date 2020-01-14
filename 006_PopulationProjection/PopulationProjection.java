public class PopulationProjection
{
    public static void main(String[]args)
    {
        int currentPop = 312032486;
        int birthSec = 7;
        int deathSec = 13;
        int immigrantSec = 45;
        int secYear = 31536000; 
        int newPop = (secYear/birthSec) - (deathSec/secYear) + (secYear/immigrantSec);

        System.out.println(currentPop + newPop);
        System.out.println(currentPop + (newPop*2));
        System.out.println(currentPop + (newPop*3));
        System.out.println(currentPop + (newPop*4));
        System.out.println(currentPop + (newPop*5));
    }
}
 /* I opened the public class followed ny PSVMSA. Then I set a variables for the current pop and how many secs 
per 1 birth, immigrant and death using int when defining them. I set a variable to what the added pop will be per year.
Then I printed the intial pop + the newPop per year times how many years after the intial pop year. Closed it all with
appropriate brackets. */