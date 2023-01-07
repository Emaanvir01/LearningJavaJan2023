package OPPS.INHERITANCE.InheritanceChallenge;

public class Car extends Vehicle
{
    private int wheels;
    private int doors;
    private int gear;
    private boolean ismanual;

    private int current_gear;

    public Car(String name, String size, int wheels, int doors, int gear, boolean ismanual)
    {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.ismanual = ismanual;
        this.current_gear = 1;
    }

    public void chgange_gear(int current_gear)
    {
        this.current_gear = current_gear;
        System.out.println("car.setcurrent_gear() change to"  + current_gear +  "  gear");

    }



}
