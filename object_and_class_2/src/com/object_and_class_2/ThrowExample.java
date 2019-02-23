package com.object_and_class_2;

public class ThrowExample {
    public static void validate (int age) throws Exception {
        if(age<18) {
            throw new Exception("Can not vote");
        }

        System.out.println("Can vote");
    }

}
