package com.object_and_class_2;

public class Rectangle implements CalculateArea {

    @Override
    public void area(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void display() {
        System.out.println("Rectangle");
    }
}
