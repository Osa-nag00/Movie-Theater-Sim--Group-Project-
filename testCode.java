public class testCode {
    public static void main(String[] args) {
        

        Movie mov1 = new Movie("poopoo", 4.56);
        System.out.println("help is this working");

        mov1.takeSeat("B5");
        mov1.takeSeat("F4");
        mov1.takeSeat("C2");
        mov1.takeSeat("B9");

        mov1.getSeats().printSeats();


    }
}
