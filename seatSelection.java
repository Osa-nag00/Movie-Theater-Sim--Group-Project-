import java.util.Arrays;


// class that stores current seat for
// any given movie in a matrix of 36 slots

public class seatSelection 
{

    private final int row = 6;
    private  final int col = 6;
    private int numSeatsTaken = 0;
    private int[][] seatsMatrix = new int[row][col];

    // constructs a new seat matrix
    // and fills matrix with zeros
    seatSelection()
    {
        int i;
        for (i = 0; i < row; i++)
        {
            Arrays.fill(seatsMatrix[i],0);
        }
    }


    // both take and remove seat functions return 1 if they can successfully
    // take and open seat or remove a used seat respectively
    // return -1 if that task can't be completed
    // -2 if exception was caught

    public void takeSeat(javax.swing.JToggleButton toggleButton)
    {

        int rowID;
        int colID;
        char[] seatIdArr = new char[2];

        try {
            seatIdArr = toggleButton.getText().toCharArray();
        } catch (Exception e) {
            return;
        }
        // change input format to usable numbers for array
        rowID = Character.toLowerCase(seatIdArr[0]) - 'a';
        colID = Character.getNumericValue(seatIdArr[1]) - 1;

        // if seat out of bounds, return
        if ((rowID > row || rowID < 0) || (colID > row || colID < 0))
        {
            return;
        }

        // checks if seat is already taken
        if (seatsMatrix[rowID][colID] == 1)
        {
            return;
        }
        else
        {
            numSeatsTaken +=1;
            seatsMatrix[rowID][colID] = 1;
            return;
        }
    }

    public void removeSeat(javax.swing.JToggleButton toggleButton)
    {

        int rowID;
        int colID;
        char[] seatIdArr = new char[2];

        try {
            seatIdArr = toggleButton.getText().toCharArray();
        } catch (Exception e) {
            return;
        }
        // change input format to usable numbers for array
        rowID = Character.toLowerCase(seatIdArr[0]) - 'a';
        colID = Character.getNumericValue(seatIdArr[1]) - 1;

        // if seat out of bounds, return
        if ((rowID > row || rowID < 0) || (colID > row || colID < 0))
        {
            return;
        }

        // checks if seat is already taken
        if (seatsMatrix[rowID][colID] == 1)
        {
            numSeatsTaken -=1;
            seatsMatrix[rowID][colID] = 0;
            return;
        }
        return;
    }

    public int seatTaken(javax.swing.JToggleButton toggleButton)
    {

        int rowID;
        int colID;
        char[] seatIdArr = new char[2];

        try {
            seatIdArr = toggleButton.getText().toCharArray();
        } catch (Exception e) {
            return -2;
        }

        // change input format to usable numbers for array
        rowID = Character.toLowerCase(seatIdArr[0]) - 'a';
        colID = Character.getNumericValue(seatIdArr[1]) - 1;

        // if seat out of bounds, return
        if ((rowID > row || rowID < 0) || (colID > row || colID < 0))
        {
            return -2;
        }

        // checks if seat is already taken
        if (seatsMatrix[rowID][colID] == 1)
        {
            return -1;
        }

        return 1;
          
    }

    public int getNumSeatsTaken()
    {
        return this.numSeatsTaken;
    }

}



