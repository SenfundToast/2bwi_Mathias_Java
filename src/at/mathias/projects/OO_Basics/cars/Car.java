package at.mathias.projects.OO_Basics.cars;

public class Car {
    private String color;
    private double maxSpeed;
    private double basePrice;
    private String basicConsumption;
    private Manufacturer manufacturer;
    private Engine engine;
    private String carModel;

    public Car(String color, double maxSpeed, double basePrice, String basicConsumption, Manufacturer manufacturer, Engine engine, String carModel) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.basicConsumption = basicConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.carModel = carModel;
    }

    public void Cost() {
        System.out.println("I am driving");
    }

    public void carOverview() {
        System.out.println("Car Model: " + this.carModel);
        System.out.println("Color: " + this.color);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Car Price: " + this.basePrice);
        System.out.println("Country of the Car: " + this.manufacturer.getCountryOfManufacturer());
        System.out.println("Name of the Car: " + this.manufacturer.getNameOfManufacturer());
        System.out.println("Discount Price: " + this.manufacturer.getDiscountOfManufacturer());
    }
    public void totalPrice(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
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
