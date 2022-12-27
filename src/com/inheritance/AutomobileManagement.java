package com.inheritance;

public class AutomobileManagement {
    public static void main(String Args[])
    {
        Car mercedes = new Car();
        Car bmw = new Car();
        mercedes.numberOfWheels = 4;
        bmw.numberOfWheels = 4;

        Bike r15 = new Bike();
        Bike duke = new Bike();
        r15.numberOfWheels = 2;
        duke.numberOfWheels = 2;

        Vehicle veh = mercedes;
        Vehicle veh1 = new Vehicle();
        SuperCar supcar = new SuperCar();

        veh.move();
        veh1.move();
        duke.move();
        bmw.move();

        System.out.println("Number of Wheels of R15= "+r15.numberOfWheels);
        System.out.println("Number of Wheels of BMW= "+bmw.numberOfWheels);
        duke.printNumberOfWheels();

        veh1.vehicle();
        supcar.turbo();
        supcar.changeWheels();
    }
}
