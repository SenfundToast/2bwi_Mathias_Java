package at.mathias.projects.OO_Basics.cars;

public class Engine {
    public enum TYPE {DIESEL, BENZIN};

    private int horsePower;



    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
