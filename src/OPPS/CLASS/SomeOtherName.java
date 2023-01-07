package OPPS.CLASS;

public class SomeOtherName
{
    public static void main(String[] args)
    {
        Car swift = new Car();

        Car audi = new Car();

      //  System.out.println(" model is " + swift.getModel());
        swift.setModel("SWIFT_VDI" );
        System.out.println(" model is " + swift.getModel());


        audi.setModel("R9");
        System.out.println("model is " + audi.getModel());


        System.out.println("********************************************************************************************");

        System.out.println("challenge");

        BANKACCOUNT bobaccunt = new BANKACCOUNT();

        bobaccunt.withdraw(100);

        bobaccunt.deposit(1000);

        bobaccunt.withdraw(900);

        System.out.println(bobaccunt.getPhone_number());


        BANKACCOUNT timaccount =  new BANKACCOUNT("hhhh","xyx@gmail.com","35353535535");
        System.out.println(timaccount.getBalance() + " name is " + timaccount.getName() );

       

    }
}