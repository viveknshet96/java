class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is starting.");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                Thread.sleep(500); // Simulate work
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " is exiting.");
    }
}

public class MultithreadDemo {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();
        t2.start();
	t1.setpriority(2);

	System.out.println(t1);

        System.out.println("Is Thread-1 alive? " + t1.isAlive());
        System.out.println("Is Thread-2 alive? " + t2.isAlive());

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Is Thread-1 alive after join? " + t1.isAlive());
        System.out.println("Is Thread-2 alive after join? " + t2.isAlive());

        System.out.println("Main thread exiting.");
    }
}
