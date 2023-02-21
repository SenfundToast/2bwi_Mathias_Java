package at.mathias.projects.OO_Basics.car;

public class Tire {
    public enum TYPE {SUMMER_TIRES, WINTER_TIRES, ALL_WEATHER_TIRES}

    private int position;
    private int FuelEfficiency;


    public Tire(int position, int fuelEfficiency) {
        this.position = position;
        FuelEfficiency = fuelEfficiency;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getFuelEfficiency() {
        return FuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        FuelEfficiency = fuelEfficiency;
    }
}
