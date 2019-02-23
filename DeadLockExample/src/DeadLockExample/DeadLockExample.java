package DeadLockExample;

public class DeadLockExample {

    public static void main(String[] args) {
        final String resource1 = "resource1";
        final String resource2 = "resource2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        System.out.println(ie.getCause().getMessage());
                        System.out.println(ie.getMessage());
                    }

                    synchronized(resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized(resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        System.out.println(ie.getCause().getMessage());
                        System.out.println(ie.getMessage());
                    }

                    synchronized(resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
