
import java.util.*;

class Numbers
{
    public int FactorsMultiplication(int iNo1)
    {
        int iCnt = 0;
        int iMult = 1;

        for(iCnt = 1; (iCnt <= iNo1/2);iCnt++)
        {
            if ((iNo1 % iCnt == 0))
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}
public class Program255 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;

        System.out.println("Enter the Number :");
        iNo1 = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.FactorsMultiplication(iNo1);

        System.out.println("Mutiplication of factors "+ iNo1 +" is : "+iRet);

    }
}
