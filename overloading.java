import java.lang.*;
class Demo
{

    public Overloading()
    {
        
    }

    public Overloading(int a,int b)
    {

    }
}
class funoverloading
{
    public static void main(String arg[])
    {
        System.out.println("Inside mian ");
        
        Demo obj=new Demo();

        

        System.out.println(obj.i);
        System.out.println(obj.j);

        System.out.println(obj1.i);
        System.out.println(obj1.j);

    }
}