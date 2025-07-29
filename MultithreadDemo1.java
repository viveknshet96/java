class MyThread extends Thread {
    MyThread(String name) {
        super(name);     }

    public void run() {
        //System.out.println(getName() + " (ID: " + getId() + ") is starting with priority " + getPriority());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " - Count: " + i);
                Thread.sleep(500);            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " is exiting.");
    }
}

public class Multithread {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.MAX_PRIORITY);  // 10

        t1.setName("1--Thread");
        t2.setName("2--Thread");

        t1.start();
        t2.start();

    
        System.out.println("Thread t1 info: " + t1);
        System.out.println("Thread t2 info: " + t2);

        System.out.println(t1.getName() + " is alive? " + t1.isAlive());
        System.out.println(t2.getName() + " is alive? " + t2.isAlive());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println(t1.getName() + " is alive after join? " + t1.isAlive());
        System.out.println(t2.getName() + " is alive after join? " + t2.isAlive());

        System.out.println("Main thread exiting.");
    }
}
