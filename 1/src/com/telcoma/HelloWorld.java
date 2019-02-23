package com.telcoma;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("HelloWorld");

        int a = 10, b = 300, c = 600;
        if(a > b) {
            if(a > c) {
                System.out.println("A > B&C");
            } else {
                System.out.println("C>A>B");
            }
        } else {
            if(a > c) {
                System.out.println("B > A > C");
            } else {
                System.out.println("C < A < B");
            }
        }

        A.checkA(220);

        A a_obj = new A();

        a_obj.for1to10();

        int[] arr = new int[] {101,111,121,131};
        a_obj.foreach(arr);
    }
}

class A {

    int for1to10() {
        for(int i = 1; i<=10; i++)
            System.out.println(i);

        return 123;
    }

    int foreach(int[] array) {
        for(int i:array) {
            System.out.println(i);
        }

        return array.length;
    }

    static void checkA(int a) {
        switch(a) {
            case 10:
                System.out.println("10 selected");
                break;
            case 20:
                System.out.println("20 selected");
                break;
            case 30:
                System.out.println("30 selected");
                break;
            case 40:
                System.out.println("40 selected");
                break;
            default:
                System.out.println("default");
                break;

        }
    }
}