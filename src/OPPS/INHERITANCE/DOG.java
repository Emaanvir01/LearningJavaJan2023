package OPPS.INHERITANCE;

public class DOG extends ANIMAL
{
    public DOG(int brain, int body, int size, int weight, String name)
    {
        super(brain, body, size, weight, name);
    }

    private String coat;
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;


    public DOG( int size, int weight, String name, String coat, int eyes, int legs, int tail, int teeth)
    {
        super(1, 1, size, weight, name);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew()
    {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat()
    {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        move(4);
    }

    public void  run()
    {
        System.out.println("dog.run() called");
        move(8);
    }

    public void  movelegs(int spped)
    {
        System.out.println("DOg.movelegs() called");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("override method was called dog.move()");
        movelegs(speed);
        super.move(speed);
    }


}
