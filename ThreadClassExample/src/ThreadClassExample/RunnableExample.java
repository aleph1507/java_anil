package ThreadClassExample;

public class RunnableExample implements Runnable {

    public static void main(String[] args) {
        RunnableExample runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("main method");
    }

    @Override
    public void run() {
        System.out.println("Run method of Runnable interface");
    }
}
