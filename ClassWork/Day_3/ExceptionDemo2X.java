import java.util.*;

class ExceptionDemo2X

{
    public static void main(String A[])

    {

    Scanner sobj = new Scanner (System.in);    // the keyword and the methods starting letter are lowercase and the class and interface names start with uppercase 

    int Arr [] = {11,21,51,101,111};
    int Index = 0;

    try 
    {
        
    System.out.println("Enter the Index:");

    Index = sobj.nextInt();

    System.out.println( "Element is:" +Arr[Index]);
    }
    catch(ArrayIndexOutOfBoundsException aobj)
    {
        System.out.println("Inside Catch: "+aobj);
    }

    System.out.println("End of Main");

    
    }
}