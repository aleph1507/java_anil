package synchronisation;

public class MainClass {

    public static void main(String[] args) {
        PrintTable table1 = new PrintTable();
        PrintTable table2 = new PrintTable();
        Thread1 t1 = new Thread1(table1);
        Thread2 t2 = new Thread2(table2);

        t1.start();
        t2.start();
    }


}
