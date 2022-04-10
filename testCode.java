import java.util.Scanner;

public class testCode 
{
    public static void main(String[] args) 
    {
        
        MovieGUI gui = new MovieGUI();
        gui.setVisible(true);
        signUp();

    }

    public static MovieAccount signUp()
    {   
        Scanner inp = new Scanner(System.in);
        MovieAccount newUser;
        double balance;
        String name;
        String email;

        System.out.println("Please create an account.");

        System.out.print("Enter your name: ");
        name = inp.nextLine();

        System.out.print("Enter your balance: ");
        balance = inp.nextDouble();

        System.out.print("Enter your email: ");
        email = inp.nextLine();

        newUser = new MovieAccount(balance, name, email);

        return newUser;
    }

}
