package at.mathias.projects.OO_Basics.cars;

public class Car {
    private String color;
    private String maxSpeed;
    private String basePrice;
    private String basicConsumption;
    private Manufacturer manufacturer;
    private Engine engine;

    public Car(String color, String maxSpeed, String basePrice, String basicConsumption, Manufacturer manufacturer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.basicConsumption = basicConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getBasicConsumption() {
        return basicConsumption;
    }

    public void setBasicConsumption(String basicConsumption) {
        this.basicConsumption = basicConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
