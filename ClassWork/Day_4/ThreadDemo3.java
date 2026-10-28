class Demo implements Runnable            //(it is stored in .java.lang)
{
    public void run()
    {
        System.out.println("Thread is running.....");
    }
}
class ThreadDemo3
{
    public static void main(String A[])

    {
        System.out.println("Inside main thread"); 

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();  //Error
        dobj2.start();  //Error                  // in this code there are three threads two is created and one is main thread which is invisible
        
    }
}

