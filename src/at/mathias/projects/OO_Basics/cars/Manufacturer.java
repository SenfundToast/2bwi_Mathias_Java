package at.mathias.projects.OO_Basics.cars;

public class Manufacturer {
    private String nameOfManufacturer;
    private String countryOfManufacturer;
    private String discountOfManufacturer;


    public Manufacturer(String nameOfManufacturer, String countryOfManufacturer, String discountOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.countryOfManufacturer = countryOfManufacturer;
        this.discountOfManufacturer = discountOfManufacturer;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }

    public void setCountryOfManufacturer(String countryOfManufacturer) {
        this.countryOfManufacturer = countryOfManufacturer;
    }

    public String getDiscountOfManufacturer() {
        return discountOfManufacturer;
    }

    public void setDiscountOfManufacturer(String discountOfManufacturer) {
        this.discountOfManufacturer = discountOfManufacturer;
    }
}
