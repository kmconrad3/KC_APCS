public class Table{
    public static void main(String[]args){

        CardDispenser cd = new CardDispenser();
        int cardOne = cd.getCard();
        int cardTwo = cd.getCard();

        cd.total = cardOne + cardTwo;
        System.out.print("You have a " + cardOne + " and a " + cardTwo + ". Your total value right now is: " + total);

        int dealerCard = cd.getCard();
        System.out.println("The dealers card and value is " + dealerCard);
    }
}