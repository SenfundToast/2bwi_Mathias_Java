package at.mathias.projects.OO_Basics.car;

public class Car {
    public String color;
    public double fuelConsumption;
    public String serialNumber;
    public double fuelAmount;
    public int maxFuelAmount;

    public void drive() {
        this.fuelAmount -= this.fuelConsumption / 100;
        System.out.println("I am driving");
    }

    public void brake() {
        System.out.println("I brake");
    }

    public void turboBoost() {
        if (this.fuelAmount >= 0.1 * this.maxFuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfReception) {
        for (int i = 0; i < amountOfReception; i++) {
            System.out.println("Tuuut!");
        }
    }

    public double getRemainingRange() {
        return this.fuelAmount;
    }

    public Car(int fuelAmount, String color, String serialNumber) {
        this.fuelAmount = fuelAmount;
        this.color = color;
        this.serialNumber = serialNumber;
    }

}


