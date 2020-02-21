public class FavoriteMovies{
    String[] movies = new String[3];
    // create and define length of movies array
    public static void main(String[]args){

        FavoriteMovies fm = new FavoriteMovies();
        // in main make a class instance to access the array
        fm.movies[0]= "Little Women";
        fm.movies[1] = "The Sound of Music";
        fm.movies[2]= "A Star is Born";
        // load each movie string into the array slot separatly
        
        System.out.println(fm.movies[0]);
        System.out.println(fm.movies[1]);
        System.out.println(fm.movies[2]);
        // print out each item of the array
    }
}