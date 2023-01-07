package _Basic.OPPS.ConstructorChallenge;

public class Vipcustomer
{
    private String name;
    private double credit_limit;
    private String email_address;

    public Vipcustomer()
    {
        this("timy",2020.20,"abb@mail.com");

    }

    public Vipcustomer(String name, String email_address)
    {
        this(name,200.20,email_address);

    }

    public Vipcustomer(String name, double credit_limit, String email_address)
    {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;
    }

    public String getName()
    {
        return name;
    }

    public double getCredit_limit()
    {
        return credit_limit;
    }

    public String getEmail_address()
    {
        return email_address;
    }
}
