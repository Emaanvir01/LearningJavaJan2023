package OPPS.INHERITANCE.InheritanceChallenge;

public class Vehicle
{
    private String name;
    private String size;

    private int current_velocity;
    private int current_direction;


    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;
        this.current_direction= 0;
        this.current_velocity = 0;

    }

    private void steer(int direction)
    {
        current_direction += direction;
        System.out.println("vehivle.ster() called" + current_direction + "at deggeee");
    }

    private void move(int velocity,int direction)
    {
      current_direction = direction;
      current_velocity = velocity;
        System.out.println("vehicle.move() called " +  current_velocity + " i n direction " + current_direction);
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public int getCurrent_velocity()
    {
        return current_velocity;
    }

    public void setCurrent_velocity(int current_velocity)
    {
        this.current_velocity = current_velocity;
    }

    public int getCurrent_direction()
    {
        return current_direction;
    }

    public void setCurrent_direction(int current_direction)
    {
        this.current_direction = current_direction;
    }
}
