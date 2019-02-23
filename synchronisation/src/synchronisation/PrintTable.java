package synchronisation;

import static java.lang.Thread.currentThread;

public class PrintTable {

//    public synchronized void printTable(int n) throws InterruptedException {
//        for(int i = 0; i<5; i++) {
//            System.out.println(i*n);
//            Thread.sleep(1000);
//        }
//    }

//    public void printTable(int n) throws InterruptedException {
//        synchronized(this) {
//            for(int i = 0; i<5; i++) {
//                System.out.println(currentThread().getName() + ": " + i*n);
//                Thread.sleep(1000);
//            }
//        }
//    }

    // static synchronized applies the lock at class not object

    public static synchronized void printTable(int n) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(currentThread().getName() + ": " + i * n);
            Thread.sleep(1000);
        }
    }
}
