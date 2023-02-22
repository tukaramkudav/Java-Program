import java.util.*;

class Numbers
{
    public void DisplayEvenFactor(int iValue)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= (iValue/2); iCnt+=2)      //iCnt = iCnt + 2
        {
            if ((iValue % iCnt) == 0)
            {
                System.out.println("Even Factor "+iCnt);
            }
        }
    }
}

public class EvenFactor2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.DisplayEvenFactor(iNo);

    }    
}
