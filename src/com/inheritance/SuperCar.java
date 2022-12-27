package com.inheritance;

public class SuperCar extends Car {
    public void turbo()
    {
        System.out.println("In Turbo Mode.");
    }

    public void changeWheels()
    {
        numberOfWheels = 8;
        System.out.println(numberOfWheels);
    }
}
