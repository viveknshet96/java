class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("trying to call B.last()"+name);
        b.last();     }

    synchronized void last() {
        System.out.println(Thread.currentThread().getName() + " inside A.last");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("trying to call A.last()"+name);
        //a.last();      
	}

    synchronized void last() {
        System.out.println(Thread.currentThread().getName() + " inside B.last");
    }
}


public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this, "Second Thread");
        t.start();

        a.foo(b); 
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a); 
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}