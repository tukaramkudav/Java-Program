import java.security.PublicKey;
import java.util.*;

import javax.management.ObjectName;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter "+Arr.length+" Elememts");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the Element No :"+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("ELements of Array Are : ");
        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

public class Program258 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter the Size :");
        int iSize = sobj.nextInt();

        ArrayX obj = new ArrayX(iSize);
        obj.Accept();
        obj.Display();
    }
}
