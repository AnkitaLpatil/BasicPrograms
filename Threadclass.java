import java.lang.*;

class Demo extends Thread
{
public void run()
{
    System.out.println("Inside Thread"+Thread.currentThread().getName());
}

}

class Threadclass
{
    public static void main(String arg[])
    {
    
    Demo obj=new Demo();

    Thread t1=new Thread(obj,"Second");
    t1.start();
    // t2.start();
    }
}

