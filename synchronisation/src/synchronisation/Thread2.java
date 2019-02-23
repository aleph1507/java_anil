package synchronisation;

public class Thread2 extends Thread {
    private PrintTable table;

    public Thread2(PrintTable table) {
        this.table = table;
    }

    public void run() {
        try {
            System.out.println("Thread2");
            table.printTable(10);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
