import java.util.Scanner;
import java.util.*;

public class Addition2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1= 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter First Number :");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);
    }    
}
