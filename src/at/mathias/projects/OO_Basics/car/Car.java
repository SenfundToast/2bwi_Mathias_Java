package at.mathias.projects.OO_Basics.car;

public class Car {
    public String color;
    public int fuelConsumption;
    public String serialNumber;
    public int fuelAmount;

    public void drive(int amount){
        this.fuelAmount -= fuelConsumption /100 * amount;
        System.out.println("I am driving");
    }
    public void brake(){
        System.out.println("I brake");
    }
}
