import java.util.*;

class Numbers
{
    public void DisplayEvenFactor(int iValue)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iValue/2); iCnt++)
        {
            if ((iValue % iCnt) == 0 && ((iCnt % 2) == 0))
            {
                System.out.println("Even Factor "+iCnt);
            }
        }
    }
}

public class EvenFactor 
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
