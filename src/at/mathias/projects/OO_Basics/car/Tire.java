package at.mathias.projects.OO_Basics.car;

import java.lang.reflect.Type;

public class Tire {


    public enum TYPE {SUMMER_TIRES, WINTER_TIRES, ALL_WEATHER_TIRES}

    private int position;
    private int noiseBar;
    private Type type;

    public Tire(int position, int noiseBar, TYPE summerTires) {
        this.position = position;
        this.noiseBar = noiseBar;
    }



    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNoiseBar() {
        return noiseBar;
    }

    public void setNoiseBar(int noiseBar) {
        this.noiseBar = noiseBar;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
