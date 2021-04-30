package Class;

public class fruitMain {
    public static void main(String[] args)
    {
        Orange o=new Orange();
        double qua=o.OrderQuality(12);
        System.out.println("The year's quality is "+qua);

        Apple a=new Apple();

        a.setName("Fuji");
        a.setWeight(13.4);
        System.out.println(a.getName()+" weight is "+a.getWeight());
        System.out.println("The OrderQua is "+a.OrderQuality(12));
    }
}
