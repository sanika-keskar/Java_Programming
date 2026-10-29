
class Demo extends Thread               // Graphical user interface         two libraries of java 
{
    public void run()
    {
        System.out.println("Thread "+Thread.currentThread().getName()+" "+i);      // interview question can you shedule the which thread will execute ans is no one can predict it depends on the thrad scheduling algorithm
    }
}
class ThreadDemo7
{
    public static void main(String A[]) throws Exception  // gharasamorche patti example 

    {
        System.out.println("Inside main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();  // here the thread objects create automatically beacuse the thread is parrent class of demo  class


        dobj1.setName("First_Thread");
        dobj2.setName("Second_Thread");
        dobj1.start();
        dobj2.start(); 
        
        // in this code there are three threads two is created and one is main thread which is invisible
        
        dobj1.join();            // vimannagar philips mall sir and madam example 
        dobj2.join();

        System.out.println("End of main thread");   // Issue is here 

    }
}                     