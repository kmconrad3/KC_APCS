public class SweetGarage
{
    public static void main(String[]args)
    {
        Car carOne = new Car();
        Car carTwo = new Car (2012, 103_000, "Nissan", "Rogue",true);
        Car carThree = new Car (2019, 17_000, "Volkswagen", "Jetta");
        Car carFour = new Car (1999, 200_000, "Toyota", "Camery");
        Car carFive = new Car (2019, 2_000, "Tesla", "ModelX");

        System.out.print("I have a "+ carOne.modelName + " ");
        System.out.print(carOne.year + " ");
        System.out.print(carOne.manufacturerName);
        System.out.print(" with " + carOne.milesDriven + " miles. ");
        System.out.print("*Try to run turbo * ");
        carOne.engageTurbo();

        System.out.print("\nI have a " + carTwo.modelName + " " + carTwo.year + " " + carTwo.manufacturerName + " with " + carTwo.milesDriven + " miles. *Try to run turbo * ");
        carTwo.engageTurbo();

        System.out.print("\nI have a " + carThree.modelName + " " + carThree.year + " " + carThree.manufacturerName + " with " + carThree.milesDriven + " miles. *Try to run turbo * ");
        carThree.engageTurbo();

        System.out.print("\nI have a " + carFour.modelName + " " + carFour.year + " " + carFour.manufacturerName + " with " + carFour.milesDriven + " miles. ");
        carFour.revEngine();
        
        System.out.print("\nI have a " + carFive.modelName + " " + carFive.year + " " + carFive.manufacturerName + " with " + carFive.milesDriven + " miles. ");
        carFive.revEngine();
    }
}
/* Open class SweetGarage with same name as file and write PSVMSA (also downloaded Car class). Then I define 5
cars. The first car resorts to the default parameters because I didn't put anything inside of it. I used the
second and third public car constructors to costumize my cars. After, for each car I printed out the facts
of the cars by concatination of strings with the car values. I used the 2 methods of Car as well for certain 
cars (using dot notiation as wel) for turbo and engine use. */