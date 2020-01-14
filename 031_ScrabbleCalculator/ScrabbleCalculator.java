import java.util.Scanner;
public class ScrabbleCalculator{
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
       System.out.print(" Enter a word in all lowercase: ");
       String word = myScan.nextLine();
        int a= 9;
        int aTotal= 0;
        int b= 2;
        int bTotal= 0;
        int c= 2;
        int cTotal= 0;
        int d= 4;
        int dTotal= 0;
        int e= 12;
        int eTotal = 0;
        int f= 2;
        int fTotal= 0;
        int g= 3;
        int gTotal = 0;
        int h= 2;
        int hTotal = 0;
        int i= 9;
        int iTotal= 0;
        int j= 1;
        int jTotal= 0;
        int k= 1;
        int kTotal= 0;
        int l= 4;
        int lTotal= 0;
        int m= 2;
        int mTotal= 0;
        int n= 6;
        int nTotal= 0;
        int o= 8;
        int oTotal= 0;
        int p= 2;
        int pTotal= 0;
        int q= 1;
        int qTotal= 0;
        int r= 6;
        int rTotal= 0;
        int s= 4;
        int sTotal= 0;
        int t= 6;
        int tTotal= 0;
        int u= 4;
        int uTotal= 0;
        int v= 2;
        int vTotal= 0;
        int w= 2;
        int wTotal= 0;
        int x= 1;
        int xTotal= 0;
        int y= 2;
        int yTotal= 0;
        int z= 1;
        int zTotal= 0;
        int points = 0;

        for (int ii = 0; ii< word.length();ii++){

            if (word.substring(ii,ii+1).equals("a") && a>= aTotal){
                aTotal++;}
            else if (word.substring(ii,ii+1).equals("b") && b >= bTotal){
                bTotal++;}
            else if (word.substring(ii,ii+1).equals("c") && c >= cTotal){
                cTotal++;}
            else if (word.substring(ii,ii+1).equals("d") && d >= dTotal){
                dTotal++;}                       
            else if (word.substring(ii,ii+1).equals("e") && e >= eTotal){
                eTotal++;}     
            else if (word.substring(ii,ii+1).equals("f") && f >= fTotal){
                fTotal++;}       
            else if (word.substring(ii,ii+1).equals("g") && g >= gTotal){
                gTotal++;}    
            else if (word.substring(ii,ii+1).equals("h") && h >= hTotal){
                hTotal++;}  
            else if (word.substring(ii,ii+1).equals("i") && i >= iTotal){
                iTotal++;}
            else if (word.substring(ii,ii+1).equals("j") && j >= jTotal){
                jTotal++;}
            else if (word.substring(ii,ii+1).equals("k") && k >= kTotal){
                kTotal++;}
            else if (word.substring(ii,ii+1).equals("l") && l >= lTotal){
                lTotal++;}
            else if (word.substring(ii,ii+1).equals("m") && m >= mTotal){
                mTotal++;}
            else if (word.substring(ii,ii+1).equals("n") && n >= nTotal){
                nTotal++;}
            else if (word.substring(ii,ii+1).equals("o") && o >= oTotal){
                oTotal++;}
            else if (word.substring(ii,ii+1).equals("p") && p >= pTotal){
                pTotal++;}
            else if (word.substring(ii,ii+1).equals("q") && q >= qTotal){
                qTotal++;}
            else if (word.substring(ii,ii+1).equals("r") && r >= rTotal){
                rTotal++;}
            else if (word.substring(ii,ii+1).equals("s") && s >= sTotal){
                sTotal++;}
            else if (word.substring(ii,ii+1).equals("t") && t >= tTotal){
                tTotal++;}
            else if (word.substring(ii,ii+1).equals("u") && u >= uTotal){
                uTotal++;}
            else if (word.substring(ii,ii+1).equals("v") && v >= vTotal){
                vTotal++;}
            else if (word.substring(ii,ii+1).equals("w") && w >= wTotal){
                wTotal++;}
            else if (word.substring(ii,ii+1).equals("x") && x >= xTotal){
                xTotal++;}
            else if (word.substring(ii,ii+1).equals("y") && y >= yTotal){
                yTotal++;}
            else if (word.substring(ii,ii+1).equals("z") && z >= zTotal){
                zTotal++;}
            else{
                System.out.println("You can not make that word because their are not enough avaliable tiles.");
            System.exit(0);}
            }

            for(int iii=0; iii< word.length();iii++){
                if ((word.substring(iii,iii+1).equals("a")) || (word.substring(iii,iii+1).equals("e")) || (word.substring(iii,iii+1).equals("i")) || (word.substring(iii,iii+1).equals("o")) || (word.substring(iii,iii+1).equals("u")) || (word.substring(iii,iii+1).equals("l")) || (word.substring(iii,iii+1).equals("n")) || (word.substring(iii,iii+1).equals("s")) || (word.substring(iii,iii+1).equals("t")) || (word.substring(iii,iii+1).equals("r"))){
                    points++;}
                else if ((word.substring(iii,iii+1).equals("d")) || (word.substring(iii,iii+1).equals("g"))){
                    points+=2;}
                else if ((word.substring(iii,iii+1).equals("b")) || (word.substring(iii,iii+1).equals("c")) || (word.substring(iii,iii+1).equals("m")) || (word.substring(iii,iii+1).equals("p"))){
                    points+=3;}
                else if ((word.substring(iii,iii+1).equals("f")) || (word.substring(iii,iii+1).equals("h")) || (word.substring(iii,iii+1).equals("v")) || (word.substring(iii,iii+1).equals("w")) || (word.substring(iii,iii+1).equals("y"))){
                    points+=4;}
                else if (word.substring(iii,iii+1).equals("k")){
                    points+=5;}
                else if ((word.substring(iii,iii+1).equals("j")) || (word.substring(iii,iii+1).equals("x"))){
                    points+=8;}
                else if ((word.substring(iii,iii+1).equals("q")) || (word.substring(iii,iii+1).equals("z"))){
                    points+=10;}
            }
            System.out.println("Your point worth is " + points + ".");

        myScan.close();
    }
}
/* Created a scanner object and a bunch of int variables. Prompted user to enter a word to be stored in
a variable. Then I use a for loop, ii being what it runs off of. ii correlates to the parameter in
the word entered. In the for statement there is a big if statement, if the ii value/word posistion at a
certain point is true to one of the statements it will add 1 to a variable meant to count how much of
a certain letter the entered word has. The second piece to all those if statements is that to be true
the total word value cannot exceed the ii limitation given. If it does, it will print out a statement
saying to word cannot be made and will end the program. Next is a for loop, same format, to 
calculate the words point value. Again, a if statement is used and iii correlates to the position in 
the entered word. If that position/letter equals one of the else statements (they basically all have an
or piece to it because alot of the letters have the same point value) it will add a certain amount to 
the point variable. For both for loops when the ii value is greater than the word length, it will 
stop looping. I print out the point value and close my scanner. */