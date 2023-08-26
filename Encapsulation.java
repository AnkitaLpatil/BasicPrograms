import java.lang.*;
class Demo
{
    public int i;
    public int j;

    public Demo()
    {
        this.i=3;
        this.j=4;
    }

    public void Fun()
    {
System.out.println("Inside fun ");
    }
}
class Encapsulation
{
    public static void main(String arg[])
    {
        System.out.println("Inside mian ");
        Demo obj=new Demo();

        obj.Fun();

        System.out.println(obj.i);
        System.out.println(obj.j);

    }
}