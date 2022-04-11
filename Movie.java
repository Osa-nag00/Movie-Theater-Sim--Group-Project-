public class Movie
{

    private String name;
    private double ticketPrice;
    private seatSelection seats;

    Movie(String name, double ticketPrice)
    {

        this.name = name;
        this.ticketPrice = ticketPrice;
        this.seats = new seatSelection();
    }


    public String getName() 
    {
        return this.name;
    }

    public double getTicketPrice() 
    {
        return this.ticketPrice;
    }

    public seatSelection getSeats() 
    {
        return seats;
    }

    public void takeSeat(javax.swing.JToggleButton toggleButton) 
    {
        this.seats.takeSeat(toggleButton);
    }

    public void removeSeat(javax.swing.JToggleButton toggleButton) 
    {
        this.seats.removeSeat(toggleButton);
    }

    public int seatTaken(javax.swing.JToggleButton toggleButton)
    {
        return this.seats.seatTaken(toggleButton);
    }

}