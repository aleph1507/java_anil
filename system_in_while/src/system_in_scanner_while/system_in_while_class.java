package system_in_scanner_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class system_in_while_class {

    public static void main(String[] args) {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");

        int a = 0;

        try {
            a = scanner.nextInt();
            int i = 1;
            while(i<=a) {
                if(i == 5) {
                    i++;
                    continue;
                }
                System.out.println(i++);
            }
        } catch(InputMismatchException ime) {
            System.out.println("ime");
            ime.printStackTrace();
        }


        System.out.println("a = " + a);

        do_while.dowhile(a);
    }
}

class do_while {
    static void dowhile(int a) {
        //int a = 10;
        int i = 1;
        do {
            System.out.println("do_while");
          System.out.println(i);
        } while(i++<a);
    }
}
