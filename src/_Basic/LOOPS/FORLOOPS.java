package _Basic.LOOPS;

public class FORLOOPS
{
    public static void main(String[] args)
    {
        System.out.println("intreset  is  " + calculateintrese(10000.0,2.0));




        for(int i = 2;i <=8 ; i++)
     {
          System.out.println("intreset  with " +  i  + "% intreset  "  +  calculateintrese(10000.0,i));
     }

        System.out.println("*******************************************************************************************");

        for(int i = 8;i >=  2 ; i--)
        {
            System.out.println("intreset  with " +  i  + "% intreset  "  +  calculateintrese(10000.0,i));
        }



    }

    public  static  double calculateintrese(double amount , double intresetrate)
    {
        return ( amount * (intresetrate / 100));
    }
}
