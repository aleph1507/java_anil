package ThreadClassExample;

import java.util.LinkedList;

public class PreemtiveDaemonThread extends Thread {

    public void run() {
//        for(int i = 0; i<10; i++){
            System.out.println("Executing thread: " + currentThread().getName());
            System.out.println(currentThread().getName() + ": " + currentThread().getPriority());
//        }
    }

    public static void main(String[] args) {
//        PreemtiveDaemonThread pdt1 = new PreemtiveDaemonThread();
//        PreemtiveDaemonThread pdt1 = new PreemtiveDaemonThread();
        LinkedList<PreemtiveDaemonThread> PDT_list = new LinkedList<PreemtiveDaemonThread>();
        for(int i = 0; i<3; i++) {
            PreemtiveDaemonThread pdt = new PreemtiveDaemonThread();
            if(i == 0) pdt.setPriority(Thread.MIN_PRIORITY);
            if(i == 1) pdt.setPriority(Thread.NORM_PRIORITY);
            if(i == 2) pdt.setPriority(Thread.MAX_PRIORITY);
            pdt.setName("PDT" + i);
            PDT_list.add(pdt);
        }
//        pdt1.setName("PDT1");
//        System.out.println(currentThread().getName()); main
//        pdt1.start();
        for(PreemtiveDaemonThread pdt:PDT_list) {
            pdt.start();
        }
    }
}
