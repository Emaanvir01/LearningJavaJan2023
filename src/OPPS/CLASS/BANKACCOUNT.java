package OPPS.CLASS;

public class BANKACCOUNT
{
                                                         // CHALLENGE FOR  CLASSES //
    private  String accunt_no;
    private  double balance;
    private  String name;
    private  String email;
    private  String  phone_number;


    public BANKACCOUNT()
    {
        this("2020202020",2200.20,"DEFAULT NAME" , "XYZ@EMAIL.COM" ,"12345678910");
        System.out.println("empty  constructor was  called");
    }

    public BANKACCOUNT(String accunt_no, double balance, String name, String email, String phone_number)
    {

        System.out.println("constructor with parameters called");
        this.accunt_no = accunt_no;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
    }


    public BANKACCOUNT(String name, String email, String phone_number)
    {
        this("999999", 2002.200, name, email, phone_number);

    }

    public void deposit(int deposit_money)
    {

        {
            this.balance += deposit_money;

            System.out.println("deposit of " + deposit_money + " done");
            System.out.println("new balance = " + this.balance);
        }


    }

    public void  withdraw(int withdrawal_money)
    {
//        int withdrawal_money_allowed = 2000;
//
//        withdrawal_money => withdrawal_money_allowed;

        if(this.balance > 0)
        {
            this.balance -= withdrawal_money;
            System.out.println("withdrawal of " + withdrawal_money + " done");
            System.out.println("balance left " + this.balance);
        }
        else if (withdrawal_money > this.balance)
        {
            System.out.println("your balance is " + this.balance + "so  withdrawal  not possible");
        }
//        else
//        {
//            System.out.println("greeb  hai tu");
//        }
    }




    public String getAccunt_no()
    {
        return accunt_no;
    }

    public void setAccunt_no(String accunt_no)
    {
        this.accunt_no = accunt_no;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone_number()
    {
        return phone_number;
    }

    public void setPhone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
}
