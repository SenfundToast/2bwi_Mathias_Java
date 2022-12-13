package at.mathias.projects.OO_Basics.car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(50,"Yellow","C1234");
        //c1.color ="Yellow";
        c1.fuelConsumption = 500;
        //c1.serialNumber ="C1234";
        //c1.maxFuelAmount=50;
        System.out.println("Fuel: " +c1.fuelAmount);
        c1.drive();
        System.out.println("Fuel: " +c1.fuelAmount);
        c1.brake();
        c1.turboBoost();
        c1.honk(2);
        System.out.println("Remaining range: " + c1.getRemainingRange());

        Car c2 = new Car(1,"green","1234");
        System.out.println("");
        System.out.println(c2.color);
    }
}
