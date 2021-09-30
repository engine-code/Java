package Interface;
/*
default method
 */
public interface Person
{
    void  Walk();
    default int Run(int dist)
    {
        return dist*2;
    }
}
