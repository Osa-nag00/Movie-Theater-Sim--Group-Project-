public class movieSelection {

    private Movie[] movieSelection = new Movie[4];

    // creates 4 movies with different names and prices
    // and holds them in an array
    movieSelection()
    {
        movieSelection[0] = new Movie("PeePeeJones", 6.00);
        movieSelection[1] = new Movie("PeeJones", 8.00);
        movieSelection[2] = new Movie("EJones", 4.00);
        movieSelection[3] = new Movie("Jones", 5.50);
    }

    public Movie getMovieSelection(int movieNum) 
    {
        return this.movieSelection[movieNum];
    }

}
