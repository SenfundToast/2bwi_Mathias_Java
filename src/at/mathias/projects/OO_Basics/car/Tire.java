package at.mathias.projects.OO_Basics.car;

public class Tire {


    public enum TYPE {SUMMER_TIRES, WINTER_TIRES, ALL_WEATHER_TIRES}

    private int position;
    private double noiseBar;

    public Tire(int position, double noiseBar, TYPE summerTires) {
    }

    public Tire(int position, int fuelEfficiency) {
        this.position = position;
        noiseBar = fuelEfficiency;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getNoiseBar() {
        return noiseBar;
    }

    public void setNoiseBar(int noiseBar) {
        this.noiseBar = noiseBar;
    }
}
