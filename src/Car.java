/**
 *  Author: Salman
 *
 *  This class serves as a blueprint for a Car object which holds information related to a car.
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private String vin;

    /**
     * Creates a Car object assigning values of parameters received to its fields
     * @param make receives car's make
     * @param model receives car's model
     * @param year receives car's manufacture year
     * @param color receives car's color
     * @param vin receives car's vin
     */
    public Car(String make, String model, int year, String color, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
    }

    /**
     * gets car's make
     * @return car's make
     */
    public String getMake() {
        return make;
    }

    /**
     * sets car's make
     * @param make receives car's make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * gets car's model
     * @return car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * sets car's model
     * @param model receives car's model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * gets car's manufacture year
     * @return car's manufacture year
     */
    public int getYear() {
        return year;
    }

    /**
     * sets car's manufacture year
     * @param year receives car's manufacture year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * gets car's color
     * @return car's color
     */
    public String getColor() {
        return color;
    }

    /**
     * sets car's color
     * @param color receives car's color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * gets car's vin
     * @return car's vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * sets car's vin
     * @param vin car's vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * returns a displayable string representing all the fields of the object
     * @return a printable string
     */
    @Override
    public String toString() {
        return String.format("%-20s   %-20s   %-4d   %-20s   %-20s\n", make, model, year, color, vin);
    }
}
