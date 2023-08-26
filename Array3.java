import java.util.*;
import java.lang.*;

class Array3
{
    public static void main(String arg[])
    {
        int i=0,j=0;

        int Arr[][]=new int[2][3];

        Arr[0][0]=0;
        Arr[1][0]=11;
        Arr[0][1]=1;
        Arr[0][2]=1;
        Arr[1][1]=12;
        Arr[1][2]=13;

        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {

            System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}