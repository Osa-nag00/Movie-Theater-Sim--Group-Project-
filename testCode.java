import java.util.Scanner;

public class testCode 
{
    public static void main(String[] args) 
    {
        
        MovieSimUI gui = new MovieSimUI();
        gui.setVisible(true);
        signUp();

    }

    public static MovieAccount signUp()
    {   
        Scanner inp = new Scanner(System.in);
        MovieAccount newUser;
        double balance;
        String name;

        System.out.println("Please create an account.");

        System.out.print("Enter your name: ");
        name = inp.nextLine();

        System.out.print("Enter your balance: ");
        balance = inp.nextDouble();

        newUser = new MovieAccount(balance, name);
        newUser.setId();
        newUser.setBalance(balance);
        newUser.setName(name);
        newUser.toString();

        return newUser;
    }

}
