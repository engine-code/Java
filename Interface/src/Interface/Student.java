package Interface;

public class Student implements Person
{
    private String name;
    private int age;

    @Override
    public void Walk()
    {
        System.out.println("This is a student's walk method");
    }
}
