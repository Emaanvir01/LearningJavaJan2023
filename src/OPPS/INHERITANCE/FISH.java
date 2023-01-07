package OPPS.INHERITANCE;



public class FISH extends ANIMAL
{
    private int gills;
    private int eyes;
    private int fins;

    public FISH( int size, int weight, String name, int gills, int eyes, int fins)
    {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void  rest()
    {

    }

}
