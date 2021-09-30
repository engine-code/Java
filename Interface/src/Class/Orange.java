package Class;

public class Orange extends Fruit
{
    @Override
    public double OrderQuality(int months)
    {
        return months*2.5;
    }
    public Orange()
    {
        System.out.println("This is Orange Constructor");
    }
}
