import java.lang.*;

class marvel implements Runnable
{
    public void  run()
    {
        System.out.println("Inside Thread"+Thread.currentThread().getName());
     }
}

class mythread3
{
    public static void main(String arg[])
    {
        marvel obj =new marvel();
        Thread t1=new Thread(obj,"first");

        marvel obj1 =new marvel();
        Thread t2=new Thread(obj1,"Second");

        t1.start();
        t2.start();

    }
}