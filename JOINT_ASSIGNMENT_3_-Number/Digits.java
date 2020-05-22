public class Digits{

    public Digits(int num){
        int temp = num;
        while (true){
            // this won't ever turn false tho and what is being true?
            digitList.add(0,temp % 10);
            temp = num/10;
            if (temp<1){
                break;
            }
            // is there a simplier way to do this lol?
        }
    }
    public boolean isStrictlyIncreasing(){
        boolean answer;
        for(int i=0;i<digitList.size();i++){
            if(digitList.get(i)<digitList.get(i+1)){
                answer=true;
            }
            else{
                answer=false;
                break;
            }
        }
        return answer;
    }
// looks good


}