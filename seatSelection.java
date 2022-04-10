
import java.util.Arrays;


// class that stores current seat for
// any given movie in a matrix of 36 slots

public class seatSelection {

    private final int row = 6;
    private  final int col = 6;
    private int[][] seatsMatrix = new int[row][col];

    // construct a new seat matrix
    // and fills matrix with zeros
    seatSelection(){
        int i;
        for (i = 0; i < row; i++){
            Arrays.fill(seatsMatrix[i],0);
        }
    }


    // seat id is the location of where the seat is
    // within a 2d matrix of 36 seats
    // param will be taken in as a string in the form of [(letter,Integer)]
    // where letter can be in the range of A - F
    // and integer can be between 1 - 6
    // return 0 if seat can be taken
    // returns -1 if seat can't beat taken
    public int takeSeat(String seatID){

        int rowID;
        int colID;
        int seatIDLen =  seatID.length();
        char[] SeatIdArr = new char[seatIDLen]; 

        // invalid len for seatID will return nothing
        if (seatIDLen > 2 || seatIDLen < 0){
            return -1;
        }

        SeatIdArr = seatID.toCharArray();

        // if seatID is not in the format of [(letter,Integer)]
        // return -1
        if (Character.isLetter(SeatIdArr[0]) == false ||
            Character.isDigit(SeatIdArr[1]) == false){
            return -1;
        }
        
        // change input format to usable numbers for array
        rowID = Character.toLowerCase(SeatIdArr[0]) - 'a';
        colID = Character.getNumericValue(SeatIdArr[1]) - 1;

        if ((rowID > row || rowID < 0) || (colID > row || colID < 0))
        {
            return -1;
        }

        // checks if seat is already taken
        if (seatsMatrix[rowID][colID] == 1){
            return -1;
        }else{
            seatsMatrix[rowID][colID] = 1;
        }
        return 0;
    }

    public void printSeats(){
        int i,j;

        for (i = 0; i < row; i++){
            for (j = 0; j < col; j++){
                System.out.print(seatsMatrix[i][j]);
            }
            System.out.println();
        }
    }

}



