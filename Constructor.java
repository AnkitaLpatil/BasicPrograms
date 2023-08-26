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

    public Demo(int a,int b)
    {
this.i=a;
this.j=b;

    }
}
class Constructor
{
    public static void main(String arg[])
    {
        System.out.println("Inside mian ");
        
        Demo obj=new Demo();

        Demo obj1=new Demo(45,23);

        System.out.println(obj.i);
        System.out.println(obj.j);

        System.out.println(obj1.i);
        System.out.println(obj1.j);

    }
}