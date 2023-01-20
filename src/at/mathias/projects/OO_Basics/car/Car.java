package at.mathias.projects.OO_Basics.car;

//dont do that later
public class Car {
    //Gedächtnisvariablen - Instantzvariablen
    private Engine engine;
    private String color;
    private double fuelConsumption;
    private String serialNumber;
    private double fuelAmount;
    private int maxFuelAmount;
    private int amountFuelIntMotor;

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

    /*
        public Car(int fuelAmount, String color, String serialNumber) {
        this.fuelAmount = fuelAmount;
        this.color = color;
        this.serialNumber = serialNumber;
    }

     */

    public Car(int Engine_engine, String color, String serialNumber) {
        this.engine = engine;
        this.color = color;
        this.serialNumber = serialNumber;
    }


    public void setAmountFuelIntMotor(int amountFuelIntMotor) {
        this.amountFuelIntMotor = amountFuelIntMotor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setMaxFuelAmount(int maxFuelAmount) {
        this.maxFuelAmount = maxFuelAmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getAmountFuelIntMotor() {
        return amountFuelIntMotor;
    }

    public int getMaxFuelAmount() {
        return maxFuelAmount;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getSerialNumber() {
        return serialNumber;


    }
}


