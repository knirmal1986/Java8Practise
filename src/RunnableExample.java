

class MyThreadR1  implements Runnable{
    // run() method inside this class
    public void run()
    {
        // Iterating to get more execution of threads
        for (int i = 0; i < 5; i++) {

            // Print statement whenever run() method
            // of this class is called
            System.out.println(Thread.currentThread().getName() + " " + i);

            // Getting sleep method in try block to
            // check for any exceptions
            try {
                // Making the thread pause for a certain
                // time using sleep() method
                Thread.sleep(1000);
            }

            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}

class MyThreadR2  implements Runnable{
    // run() method inside this class
    public void run()
    {
        // Iterating to get more execution of threads
        for (int i = 0; i < 5; i++) {

            // Print statement whenever run() method
            // of this class is called
            System.out.println(Thread.currentThread().getName() + " " + i);

            // Getting sleep method in try block to
            // check for any exceptions
            try {
                // Making the thread pause for a certain
                // time using sleep() method
                Thread.sleep(1000);
            }

            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}

public class RunnableExample {

    // Main driver method
    public static void main(String[] args)
    {
        Runnable obj1 = new MyThreadR1();
        Runnable obj2 = new MyThreadR2();

        Thread t1 = new Thread(obj1, "Thread1");
        Thread t2 = new Thread(obj2, "Thread2");
        
        t1.start();
        t2.start();
    }

}
