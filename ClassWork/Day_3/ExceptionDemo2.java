import java.util.*;

class ExceptionDemo2

{
    public static void main(String A[])

    {

    Scanner sobj = new Scanner (System.in);    // the keyword and the methods starting letter are lowercase and the class and interface names start with uppercase 


    int Arr [] = {11,21,51,101,111};
    int Index = 0;

    System.out.println("Enter the Index:");

    Index = sobj.nextInt();

    System.out.println( "Element is:" +Arr[Index]);

    System.out.println("End of Main");

    
    }
}