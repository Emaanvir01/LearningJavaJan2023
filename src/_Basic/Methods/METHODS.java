package _Basic.Methods;

public class METHODS
{
    public static void main(String[] args)
    {

      // int high_Score =  calculatescore(true,1000,500,50);
      //  System.out.println("your  final  score was " +  high_Score);

       // high_Score =  calculatescore(true,10000,8,200);
     //   System.out.println("your  final  score was " +  high_Score);
        calculatescore(true,5000,50,50);
        METHODS.calculatescore(true,1000,50,10);
    }


    public  static  int   calculatescore(boolean gameover , int score , int level_comp , int bonus )
    {
        if(gameover)
        {
            int final_score = score + (level_comp *  bonus);
            final_score  += 2000;
            System.out.println("your final score is " + final_score);
            return  final_score;
        }
         return -1;
    }

    //  ************************************METHODS CHALLENGES********************************************************//


}
