package at.mathias.projects.OO_Basics.car;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(50,"Yellow","C1234");
        //c1.color ="Yellow";
        c1.setFuelConsumption(500);
        //c1.serialNumber ="C1234";
        //c1.maxFuelAmount=50;
        System.out.println(c1.getColor());
        System.out.println("Fuel: " +c1.getFuelAmount());
        c1.drive();
        System.out.println("Fuel: " +c1.getFuelAmount());
        c1.brake();
        c1.turboBoost();
        c1.honk(2);
        System.out.println("Remaining range: " + c1.getRemainingRange());

        Car c2 = new Car(1,"green","1234");
        System.out.println("");
        System.out.println(c2.getColor());

        System.out.println("");
        c1.drive();
        c1.setSpeedCar(1);
        System.out.println(c1.getSpeedCar());

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        System.out.println("");
        System.out.println(e1.getHorsePower() + " " + e1.getType());

        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);
        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.println("");

        Tire t1_1 = new Tire(1, 70, Tire.TYPE.SUMMER_TIRES);
        Tire t1_2 = new Tire(2, 69, Tire.TYPE.SUMMER_TIRES);
        Tire t1_3 = new Tire(3, 71, Tire.TYPE.SUMMER_TIRES);
        Tire t1_4 = new Tire(4, 70, Tire.TYPE.SUMMER_TIRES);


    }
}
