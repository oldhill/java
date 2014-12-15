package vehicles;

/**
 * Peddle-powered transportation machine
 */
public class Bicycle {
  // Fields
  private int gear;
  private int speed;

  // Constructor
  public Bicycle(int startGear, int startSpeed) {
    gear = startGear;
    speed = startSpeed;
  }

  // Setters
  public void setGear(int newGear) {
    gear = newGear;
  }
  public void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  // Getters
  // TODO: write something to return arraylist of state strings, or something

  // Print stuff
  public void showState() {
    System.out.println("Gear: " + gear);
    System.out.println("Speed: " + speed);
  }
}
