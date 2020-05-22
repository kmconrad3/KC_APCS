public class HiddenWord{
    public String guess;
    public String word;
    // why are these private

    public HiddenWord(String word){
        this.word=word;
    }

    public String getHint(String guess){
        this.guess=guess;
        String hint;
        // public variable in class?
        for (int i=0; i<word.length(); i++){
            if(word.substring(i,i+1).equals(guess.substring(i,i+1))){
                hint = guess.substring(i,i+1);
            }
            else if (word.indexOf(guess.substring(i,i+1))>-1){
                // make as inequality
                hint = "+";
                // add to hint
            }
            else{
                hint = "*";
                // add to hint
            }
            return hint;
            // should be outside for loop
        }
        return hint;
    }

    public static void main(String[]args){

        HiddenWord hw= new HiddenWord("Hello");
        System.out.print(hw.getHint("Hojje"));
    }
}