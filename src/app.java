import vehicles.Bicycle;

/**
 * Main process controller for app based on Java Tutorial
 */
public class app {
  /**
   * Main function
   */
  public static void main(String[] args) {
    // Yo
    System.out.println("Doing things in java...");

    // Do stuff with an imported class
    Bicycle myBicycle = new Bicycle(2, 10);

    myBicycle.showState();
  }
}
