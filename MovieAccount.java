class MovieAccount
{
    private int id; // Ticket number
    private double balance; 
    private String name; 
    
    public MovieAccount(double balance, String name)
    {
        this.balance = balance;
        this.name = name;
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
        System.out.println("Ticket number: " + id + "\n" + "Account balance: " + balance + "\n" + "Account name: " + name);
        return "Ticket number: " + id + "\n" + "Account balance: " + balance + "\n" + "Account name: " + name + "\n";
    }

    // public void sendEmail()
    // {
    //     Scanner inp = new Scanner(System.in);
    //     Properties props = new Properties();

    //     props.put("mail.smtp.auth", "true");
    //     props.put("mail.smtp.starttls.enable", "true");
    //     props.put("mail.smtp.host", "smtp.gmail.com");
    //     props.put("mail.smtp.port", "587");

    //     String myEmail = getEmail();
    //     String password = inp.nextLine();

    //     Session session = Session.getInstance
    // }

}
