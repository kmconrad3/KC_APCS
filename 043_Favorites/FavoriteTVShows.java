public class FavoriteTVShows{
    String[] tv = {"The Fosters", "Gossip Girl", "Stranger Things"};
    // make an array with the objects already inside

    public static void main(String[]args){
        FavoriteTVShows ftv = new FavoriteTVShows();
        // instance of FavoriteTVShow class

        for(int i=0; i<ftv.tv.length; i++){
            System.out.println(ftv.tv[i]);
        }
        // for loop to print each value of the array in class using i
    }
}