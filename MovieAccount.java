// import com.jscape.inet.smtp.*;
// import com.jscape.inet.email.*;
// import com.jscape.inet.mime.MimeException;
// import java.io.*;

class MovieAccount
{
    private int id; // Ticket number
    private double balance; 
    private String name; 
    private String email;
    
    public MovieAccount(double balance, String name, String email)
    {
        this.balance = balance;
        this.name = name;
        this.email = email;
    }
    
    public void setId() // Might fix later 
    {
        id = (int) (Math.random()*100)+1;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void deposit(double depositAmount)
    {
        balance += depositAmount;
    }
    
    public void withdraw(double withdrawAmount)
    {
        balance -= withdrawAmount;
    }
    
    public String toString()
    {
        return "Ticket number: " + id + "\n" + "Account balance: " + balance + "\n" + "Account name: " + name + "\n" + "Account email: " + email + "\n";
    }

    public void sendEmail(String userEmail)
    {

    }
}
