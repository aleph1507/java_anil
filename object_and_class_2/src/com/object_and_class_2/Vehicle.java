package com.object_and_class_2;

public abstract class Vehicle {
    public abstract void run();

    public void displayVehicle() {
        if(this instanceof Car)
            System.out.println("displayVehicle Car");
    }
}
