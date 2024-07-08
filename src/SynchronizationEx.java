

class Multithread implements Runnable
{
     public void run()
    {
        System.out.println(Thread.currentThread().getName() + " Thread start executing run method");
        synchronized(this) {  //Method level synchronization
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "--" + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}
public class SynchronizationEx {
    public static void main(String[] args) {
        Multithread t1 = new Multithread();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        Thread th3 = new Thread(t1);
        th1.start();
        th2.start();
        th3.start();
    }
}
