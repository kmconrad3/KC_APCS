public class FoodItem{
    private String typeFood;
    private int amount;
    public int eating;
// 2 private variables that will only be accessible in here, 1 public which can be used everywhere storing amount people eat

    public FoodItem(String typeFood, int amount ){
        this.typeFood= typeFood;
        this.amount= amount;
        // class contructor using the private variables as parameters
    }

    public String getName(){
        return typeFood;
        // way to get arount private variable and access outside of here
    }

    public int getAmount(){
        return amount;
        // way to get arount private variable and access outside of here
}

    public void afterEat(int eating){
        this.eating= eating;

        amount-=eating;
        // using the public variable in the pantryshelf class to the use this method to change amount value
    }

    public static void main(String[]args){}
    // doesn't do anything but needed in every class
}