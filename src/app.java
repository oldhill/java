import vehicles.Bicycle;

import java.util.HashMap;

/**
 * Main process controller for app based on Java Tutorial
 */
public class App {
  /**
   * Main function
   */
  public static void main(String[] args) {
    // Yo
    System.out.println("Doing things in java...");

    // Do stuff with an imported class
    Bicycle myBicycle = new Bicycle(2, 10);
    myBicycle.printState();

    HashMap myState = myBicycle.returnState();
    System.out.println(myState);
  }
}
