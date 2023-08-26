class OverloadingHelp {
public int findarea (int l, int b) {
int var1;
var1 = l * b;
return var1;
}
public int findarea (int l, int b, int h) {
int var2;
var2 = l * b * h;
return var2;
}
}
class program4
{
    public static void main(String arg[])
    {
        OverloadingHelp obj=new OverloadingHelp();
        int r=obj.findarea(2,4);
        int r1=obj.findarea(2,3,4);

        System.out.println(" rectangle Area:"+r+"triangle Area:"+r1);

    }
}