class ThreadDemo1
{
    public static void main(String A[])

    {
        System.out.println("Inside main");

        Thread t = Thread.currentThread();

        System.out.println("Current thread name is: " +t.getName());

        System.out.println("Current Thread TID is :"+t.getID());

        System.out.println("Current Thread  is alive or not :" +t.isAlive());

        System.out.println("Current Thread Priority is :"+t.getPriority());
    }
}