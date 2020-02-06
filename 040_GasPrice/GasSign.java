public class GasSign{
    public static void main(String[]args){
        GasPriceTracker gpt1 = new GasPriceTracker(2.49,"unleaded");
        GasPriceTracker gpt2 = new GasPriceTracker(2.79,"plus");
        GasPriceTracker gpt3 = new GasPriceTracker(2.99,"premium");
        // making a class instance for each type of gas with proper parameters

        System.out.println(gpt1.getName() + " costs " + gpt1.getPrice());

        System.out.println(gpt2.getName() + " costs " + gpt2.getPrice());

        System.out.println(gpt3.getName() + " costs " + gpt3.getPrice());
        // print out the name and price using the getters called off of the calss instances I defined
    }
}