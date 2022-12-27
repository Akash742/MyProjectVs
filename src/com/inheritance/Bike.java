package com.inheritance;

public class Bike extends Vehicle {
    public int numberOfWheels;
    public void move()
    {
        System.out.println("Move in Bike Class");
    }

    public void printNumberOfWheels()
    {
        numberOfWheels = 2;
        System.out.println(numberOfWheels);
        System.out.println(super.numberOfWheels);
    }
}
