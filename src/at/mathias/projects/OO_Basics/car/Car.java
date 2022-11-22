package at.mathias.projects.OO_Basics.car;

public class Car {
    public String color;
    public int fuelConsumption;
    public String serielNumber;
    public int fuelAmount;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }
    }
