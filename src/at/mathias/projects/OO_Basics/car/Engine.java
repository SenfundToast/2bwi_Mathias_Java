package at.mathias.projects.OO_Basics.car;

import groovy.lang.GString;

public class Engine {
    private Engine engine;
    private enum TYPE {DIESEL, GAS}
    private int horsePower;
    private String type; //Diesel oder Benzin

    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    /*
            amount should be between 0 and 100
             */
    public void drive(int amount) {
        System.out.println("The motor is running with" + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }
}
