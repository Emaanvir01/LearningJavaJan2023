package _Basic.OPPS.ConstructorChallenge;

public class Main
{
    public static void main(String[] args)
    {
        Vipcustomer person_1 = new Vipcustomer();
        System.out.println(person_1.getName());

        Vipcustomer person_2 = new Vipcustomer("bob" ,"yyyy@gmail.com");
        System.out.println(person_2.getName());

        Vipcustomer person_3 = new Vipcustomer("tim",10000.00,"abc@gmail.com");
        System.out.println(person_3.getName());
        System.out.println(person_3.getEmail_address());





    }
}
