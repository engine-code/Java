package Interface;
/*

 */
public class test {
    public static void main(String[] args)
    {
        Teacher t=new Teacher();
        t.Walk();
        int rundist=t.Run(20);
        System.out.println("The teacher runs "+rundist+" miles");
        Student s=new Student();
        rundist=s.Run(10);
        System.out.println("The student runs "+rundist+" miles");
        s.Walk();
    }
}
