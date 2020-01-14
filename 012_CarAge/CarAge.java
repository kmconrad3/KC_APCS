public class CarAge
{
    public static void main(String[]args)
    {
        Car carOne = new Car();
        Car carTwo = new Car (2012, 103_000, "Nissan", "Rogue",true);
        Car carThree = new Car (2019, 17_000, "Volkswagen", "Jetta");
        Car carFour = new Car (1999, 200_000, "Toyota", "Camery");
        Car carFive = new Car (2019, 2_000, "Tesla", "ModelX");

        ReturningCalculator myCalc = new ReturningCalculator();
        int currentYear = 2019;

        System.out.println("This car is " + myCalc.integerSubtractor(currentYear, carOne.year) + " years old.");
        System.out.println("This car is " + myCalc.integerSubtractor(currentYear, carTwo.year) + " years old.");
        System.out.println("This car is " + myCalc.integerSubtractor(currentYear, carThree.year) + " years old.");
        System.out.println("This car is " + myCalc.integerSubtractor(currentYear, carFour.year) + " years old.");
        System.out.println("This car is " + myCalc.integerSubtractor(currentYear, carFive.year) + " years old.");
    }
}
/* Open CarAge class with same name as file and write PSVMSA (also downloaded Car class adnd ReturningCalculator class).
Then I create five Cars. The first car resorts to the default parameters because I didn't put anything inside of it. I used the
second and third public car constructors to costumize my cars. After, I construct myCalc from ReturningCalculator class.
Then I print out the age of each car by calling myCal with dot indentation to use the subtraction method.
inside the method I use a int variable I created and then calling each car's, with dot nation, year for the parameters.
I concatinate strings into the print as well. Then close with proper brackets. */