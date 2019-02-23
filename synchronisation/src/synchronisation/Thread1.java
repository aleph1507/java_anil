package synchronisation;

public class Thread1 extends Thread {
    private PrintTable table;

    public Thread1(PrintTable table) {
        this.table = table;
    }

    public void run() {
        try {
            System.out.println("Thread1");
            table.printTable(5);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
