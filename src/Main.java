import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Dealership myDadsDealership = new Dealership(new File("cars.csv"));

        System.out.println("Dad's Dealership");
        System.out.println(myDadsDealership);

        System.out.println("1) Get car 178");
        System.out.println(myDadsDealership.getCar(178));

        System.out.println("2) Sell car 99");
        System.out.println(myDadsDealership.sellCar(99));

        System.out.println("3) Buy a used ferrari");
        myDadsDealership.buyCar("Ferrari", "Testarossa", 1996, "Red", "JH4KC1F98FC175890");

        System.out.println("4) Get the Ferrari");
        System.out.println(myDadsDealership.getCar(338));

        System.out.println("5) Sell a bunch of other cars");
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            myDadsDealership.sellCar(random.nextInt(300));
        }

        System.out.println("Dad's Dealership");
        System.out.println(myDadsDealership);
    }
}
