package _Basic.LOOPS;

public class Primenum
{
    public static void main(String[] args)
    {
       boolean isprime = true;

        int num = 9;
        for(int i =  2;i < num;i++)

        {
            if(num % i == 0)

            {
               isprime = false;
               break;
            }
        }

        if(isprime)
        {
            System.out.println(num + "  is prime");
        }
        else
        {
            System.out.println(num + " is  not prime");
        }


    }
}
