class Demo implements Runnable            //(it is stored in .java.lang)
{
    public void run()
    {
        System.out.println("Thread is running.....");
    }
}
class ThreadDemo4
{
    public static void main(String A[])

    {
        System.out.println("Inside main thread"); 

        Thread dobj1 = new Thread(new Demo());
        Thread dobj2 = new Thread(new Demo());

        dobj1.start();  
        dobj2.start();                    // in this code there are three threads two is created and one is main thread which is invisible
        
    }
}

