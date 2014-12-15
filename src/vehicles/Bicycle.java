package vehicles;

import java.util.HashMap;

/**
 * Peddle-powered transportation machine
 */
public class Bicycle {
  // Class variables (static fields)
  private static final int NUM_GEARS = 10;

  // Instance variables (non-static fields)
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
  public HashMap returnState() {
    HashMap myState = new HashMap();
    myState.put("Gear", gear);
    myState.put("Speed", speed);
    return myState;
  }

  // Print stuff
  public void printState() {
    System.out.println("Gear: " + gear);
    System.out.println("Speed: " + speed);
    System.out.println("All bicycle instances have this many gears: " + NUM_GEARS);
  }
}
