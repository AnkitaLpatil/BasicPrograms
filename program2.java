class Hospital {
int variable1, variable2;
double variable3;
public Hospital(int doctors, int nurses) {
variable1 = doctors;
variable2 = nurses;
System.out.println("2 para constructor Dr:"+variable1+" Nurses:"+variable2);
}
public Hospital(int doctors) {
variable1 = doctors;
System.out.println("1 para constructor  Dr:"+variable1);
}
public Hospital(double salaries) {
variable3 = salaries;
System.out.println("1 para  constructor Nurses:"+variable3);
}
}

class program2
{
    public static void main(String arg[])
    {
        Hospital obj=new Hospital(4,1);
        Hospital obj1=new Hospital(4);
        Hospital obj2=new Hospital(4d);

    }
}