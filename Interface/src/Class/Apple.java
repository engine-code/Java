package Class;

public class Apple extends Fruit
{
    @Override
    public double OrderQuality(int months) {
        return months*1.8;
    }
    private String name;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}
