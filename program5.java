import java.util.*;

class HumanBeing {
public int walk (int distance, int time) {
int speed = distance / time;
return speed;
}
}
class Athlete extends HumanBeing {
public int walk(int distance, int time) {
int speed = distance / time;
speed = speed * 2;
return speed;
}
}

class program5
{
    public static void main( String arg[])
    {
       HumaAnBeing obj=new Athlete();
    int r=obj.walk(10,1);
    System.out.println(r);
    }
}