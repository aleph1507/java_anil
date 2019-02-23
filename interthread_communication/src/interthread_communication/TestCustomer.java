package interthread_communication;

public class TestCustomer {

    public static void main(String[] args) {
        final Customer c = new Customer();
        Thread t1 = new Thread() {
          public void run() {
              c.withdraw(15000);
          }
        };

        Thread t2 = new Thread() {
            public void run() {
                c.deposit(10000);
            }
        };

        t1.start();
        t2.start();
    }
}
