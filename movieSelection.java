import java.text.NumberFormat;

public class movieSelection {

    private int numMovies = 4;
    private Movie[] movieSelection = new Movie[numMovies];

    // creates 4 movies with different names and prices
    // and holds them in an array
    movieSelection()
    {
        movieSelection[0] = new Movie("PeePeeJones", 6.00);
        movieSelection[1] = new Movie("PeeJones", 8.00);
        movieSelection[2] = new Movie("EJones", 4.00);
        movieSelection[3] = new Movie("Jones", 5.50);
    }

    public Movie getMovie(int movieNum) 
    {   
        // if movie index out of bounds return null
        return (movieNum > getNumMovies() || movieNum < 0) ? null : this.movieSelection[movieNum];
    }

    public String getMovieName(int movieNum)
    {   
        // if movie is null
        // returns empty string
        Movie m = getMovie(movieNum);
        return (m == null) ?  "" :  m.getName();
    }

    public String getSeatPriceString(int movieIndex)
    {   
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Movie m = getMovie(movieIndex);

        // return movie ticket price in currency format
        return (m == null) ? "" : formatter.format(m.getTicketPrice());
    }

    public double getSeatPriceDouble(int movieIndex)
    {   
        Movie m = getMovie(movieIndex);
        return (m == null) ? 0.00 : m.getTicketPrice();
    }


    public int getNumMovies()
    {
        return this.numMovies;
    }

}
