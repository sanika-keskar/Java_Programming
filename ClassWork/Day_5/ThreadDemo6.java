class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running.....");
    }
}
class ThreadDemo6
{
    public static void main(String A[]) throws Exception  // gharasamorche patti example 

    {
        System.out.println("Inside main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();  // here the thread objects create automatically beacuse the thread is parrent class of demo  class



        dobj1.start();
        dobj2.start(); 
        
        // in this code there are three threads two is created and one is main thread which is invisible
        
        dobj1.join();            // vimannagar philips mall sir and madam example 
        dobj2.join();

        System.out.println("End of main thread");   // Issue is here 

    }
}