package ThreadClassExample;

public class ThreadClassExample extends Thread {

    public void run() {
        for(int i = 0; i<50; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
                System.out.println(ie.getCause());
                System.out.println(ie.getMessage());
            }
            System.out.println("currentThread().getName(): " + currentThread().getName() +
                    " currentThread().getId(): " + currentThread().getId() + " currentThread().getState(): " + currentThread().getState());
        }
    }

    public static void main(String[] args) {
        ThreadClassExample t1 = new ThreadClassExample();
        ThreadClassExample t2 = new ThreadClassExample();
        ThreadClassExample t3 = new ThreadClassExample();
        t1.setName("ABC");
        System.out.println(t1.getState());
        t1.start();
        try {
            t1.join();
        } catch(InterruptedException ie) {
            System.out.println(ie.getCause());
            System.out.println(ie.getMessage());
        }

        t2.start();
        t3.start();
        System.out.println("main method");
    }
}
