package OPPS.INHERITANCE;

public class Main
{
    public static void main(String[] args)
    {
         ANIMAL animal = new ANIMAL(1,1,5,5,"animal");

         DOG dog = new DOG(1,20,"goli","long coat",2,4,1,30);

         dog.eat();
      //   dog.walk();
         dog.run();
    }
}
