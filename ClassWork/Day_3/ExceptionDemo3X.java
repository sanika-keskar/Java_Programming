// this code is robust code used to write in interview instead of ExceptionDemo1.java

import java.util.*;


class Demo 
{
    public static int Division(int No1, int No2)  throws ArithmeticException  //Ghrasamor pati lavley possiblity of happneing exception
    {
        return No1 / No2;
    }
}

class ExceptionDemo3X

{
    public static void main(String A[])

    {

    Scanner sobj = new Scanner (System.in);


    int No1=0,  No2=0, Ans=0;

    try
    {



    System.out.println("Enter First Number:");

    No1 = sobj.nextInt();

    System.out.println("Enter Second Number:");

    No2 = sobj.nextInt();

    Ans = Demo.Division(No1,No2); 

    }

    catch(ArithmeticException aobj)//feklela kagad aobj madhye store hoil
    {
        System.out.println( "Exception Occured:" +aobj); //postmortum report
    }

    catch(Exception eobj)
    {
        System.out.println("Inside Generic catch");
    }

    finally 
    {
        System.out.println( "Inside Finally Block:");
    }
    
        
        System.out.println( "Division is:" +Ans);
    }
}