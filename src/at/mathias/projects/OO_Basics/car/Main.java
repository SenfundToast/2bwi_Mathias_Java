package at.mathias.projects.OO_Basics.car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color ="Yellow";
        c1.fuelConsumption = 7;
        c1.serialNumber ="C1234";
        c1.fuelAmount=70;
        System.out.println("Fuel: " +c1.fuelAmount);
        c1.drive(10);
        System.out.println("Fuel: " +c1.fuelAmount);
        c1.brake();
    }
}
