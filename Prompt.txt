Coding Challenge Question:

Your dad owns a dealership. He would like you to design a program
that can be used to manage his large inventory of used cars. He's
given you a file named "cars.csv" that contains information for
each car in his entire lot of 338 used cars.

Tasks:

1) Don't change any code in Main.java
2) Write a constructor for Dealership that will open the given
   file, create a Car object for each of the entries in the file
   and add each of those entries to the `cars` ArrayList
3) This means that the Car class will need a constructor that can
   accept a line from the file and parse it (or you could parse
   the line in the Dealership class)
4) The Car class also needs private fields to hold the data from
   the file. The following types seem suitable:
      id    NOT STORED
      make  String
      model String
      year  int
      color String
      vin   String (occasionally this will be missing)
5) Be sure to add getters, setters and a `toString()` method to
   the Car class
6) The Dealership class's `getCar()` method should return the
   desired car from the cars array by its index
7) `sellCar()` should remove the Car from the ArrayList and
   return a String like "Selling car...\n" + Car object
8) `buyCar()` should make a new Car object and add it to the
   cars ArrayList. It should return the index of that added car
9) Finally the Dealership `toString()` method should print return
   a formatted String that is the listing of all the cars at the
   Dealership (HINT: if you have implemented the Car class's
   `toString()` method, you can just print the Car objects in a loop)
