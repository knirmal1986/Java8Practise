
// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

import java.util.ArrayList;

class MyThread1 extends Thread {

    // Method inside MyThread2
    // run() method which is called as
    // soon as thread is started
    public void run()
    {
        // Print statement when the thread is called

        System.out.println("Thread1 is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread1 is completed");
    }
}

// Class 2
// Main thread Class extending main Thread Class
class MyThread2 extends Thread {

    // Method inside MyThread2
    // run() method which is called
    // as soon as thread is started
    public void run()
    {

        // run() method which is called as soon as thread is
        // started

        // Print statement when the thread is called
        System.out.println("Thread2 is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread2 is completed");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread");
        MyThread1 thread1 = new MyThread1();  //creating thread obj
        MyThread2 thread2 = new MyThread2();  //creating thread obj
        MyThread1 thread3 = new MyThread1();  //creating thread obj -//New Thread
        MyThread2 thread4 = new MyThread2();  //creating thread obj -> New Thread
        thread1.start();  // runnable
        thread2.start();  //runnable
        try {
            System.out.println("Main thread is sleeing");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        thread4.start();
        System.out.println("Main thread is completed");
    }
}