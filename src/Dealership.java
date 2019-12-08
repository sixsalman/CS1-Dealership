import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Author: Salman
 *
 *  This class serves a blueprint for an object which holds an ArrayList of Car objects which hold data related to cars
 */
public class Dealership {
    private ArrayList<Car> cars = new ArrayList<>();

    /**
     * This constructor receives a File object, reads each line from it (leaving out first line), breaks each line
     * at commas (',') and passes the results, taking into account the lines in which 'vin' is absent, to the
     * constructor of a Car object which is added to this method's 'cars' field.
     * @param file receives a File object referring to a csv file holding data for a number of cars
     * @throws IOException if scanner does not find the file
     */
    public Dealership(File file) throws IOException {
        Scanner lines = new Scanner(file);
        lines.nextLine();
        cars.add(null);
        while(lines.hasNext()) {
            String[] tokens = (lines.nextLine()).split(",");
            if(tokens.length == 6) {
                cars.add(new Car(tokens[1], tokens[2], Integer.parseInt(tokens[3]), tokens[4], tokens[5]));
            } else if (tokens.length == 5){
                cars.add(new Car(tokens[1], tokens[2], Integer.parseInt(tokens[3]), tokens[4], null));
            }
        }
    }

    /**
     * gets a Car objects at a specific index (id) of 'cars' field
     * @param id receives the index (id) of the Car object
     * @return Car object at the index in 'cars'
     */
    public Car getCar(int id) {
        return cars.get(id);
    }

    /**
     * removes a sold Car object from 'cars' field
     * @param id receives the index (id) of the Car object
     * @return id of removed Car object
     */
    public String sellCar(int id) {
        cars.remove(id);
        return "Selling car" + id + "...";
    }

    /**
     * Receives information about a car, creates a Car object with that information and stores the Car object in
     * 'cars' field
     * @param make receives car's make
     * @param model receives car's model
     * @param year receives car's manufacture year
     * @param color receives car's color
     * @param vin receives car's vin
     * @return id (index) at which the Car object has been stored
     */
    public int buyCar(String make, String model, int year, String color, String vin) {
        cars.add(new Car(make, model, year, color, vin));
        return cars.size() - 1;
    }

    /**
     * gets no. of meaningful Car objects in 'cars' field which is one less that of the size of ArrayList because there
     * is no Car object at index 0
     * @return length of the 'cars' field - 1
     */
    public int getLotSize() {
        return cars.size() - 1;
    }

    /**
     * returns all the Car objects in 'cars' along with their indexes
     * @return a printable string
     */
    public String toString() {
        StringBuilder str = new StringBuilder(String.format("%-3s   %-20s   %-20s   %-4s   %-20s   %-20s\n", "ID" ,
                "Make", "Model", "Year", "Color", "Vin"));
        for(int i = 1; i < getLotSize(); i++){
            str.append(String.format("%-3d   %s", i, cars.get(i)));
        }
        str.append("\n");
        return str.toString();
    }
}
