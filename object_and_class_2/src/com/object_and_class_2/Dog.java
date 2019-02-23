package com.object_and_class_2;

public class Dog extends Animal{

    String name = "Dog";

    public Dog() {
        System.out.println("Dog class");
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(super.name);
    }


}
