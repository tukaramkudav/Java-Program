import java.util.*;;

class Arithmatic
{
    public int iValue1;     //Characterstics
    public int iValue2;     //Characterstics

    public Arithmatic(int i , int j)    //Parameterised Constructor
    {
        iValue1 = i;
        iValue2 = j;
    }
    public int Addition()   //Behaviour
    {
        int Sum = 0;
        Sum = iValue1 + iValue2;
        return Sum;
    }
}
public class Addition5 
{  
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1= 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter First Number :");
        iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1, iNo2);
        iAns = aobj.Addition();

        System.out.println("Addition is : "+iAns);
    }    
}
