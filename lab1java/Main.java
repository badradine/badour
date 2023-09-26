// Abstract class
abstract class Bicycle {
    protected String brand;
    protected int maxSpeed;
    protected int gear;

    public Bicycle(String brand, int maxSpeed, int gear) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.gear = gear;
    }

    // Abstract method
    public abstract void ride();

    // Additional method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Gear: " + gear);
    }

    // Getter and Setter methods for brand, maxSpeed, and gear (three fields)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

// Inherited class 1
class MountainBike extends Bicycle {
    private int numGears;

    public MountainBike(String brand, int maxSpeed, int gear, int numGears) {
        super(brand, maxSpeed, gear);
        this.numGears = numGears;
    }

    @Override
    public void ride() {
        System.out.println("MountainBike is riding on a trail.");
    }

    // Additional method specific to MountainBike
    public void adjustGears() {
        System.out.println("Adjusting gears for the MountainBike.");
    }
}

// Inherited class 2
class ChildrensBicycle extends Bicycle {
    private boolean hasTrainingWheels;

    public ChildrensBicycle(String brand, int maxSpeed, int gear, boolean hasTrainingWheels) {
        super(brand, maxSpeed, gear);
        this.hasTrainingWheels = hasTrainingWheels;
    }

    @Override
    public void ride() {
        System.out.println("ChildrensBicycle is riding with training wheels.");
    }

    // Additional method specific to ChildrensBicycle
    public void addTrainingWheels() {
        System.out.println("Adding training wheels to the ChildrensBicycle.");
    }
}

// Inherited class 3
class BMX extends Bicycle {
    private boolean stuntPegs;

    public BMX(String brand, int maxSpeed, int gear, boolean stuntPegs) {
        super(brand, maxSpeed, gear);
        this.stuntPegs = stuntPegs;
    }

    @Override
    public void ride() {
        System.out.println("BMX is performing stunts.");
    }

    // Additional method specific to BMX
    public void performStunt() {
        System.out.println("Performing a stunt with the BMX.");
    }
}









public class Main {
    public static void main(String[] args) {
        // Create instances of MountainBike, ChildrensBicycle, and BMX
        System.out.println(".......................................................");
     MountainBike mountainBike = new MountainBike("Trek", 30, 1, 5);
        ChildrensBicycle childrensBicycle = new ChildrensBicycle("Huffy", 20, 1, true);
        BMX bmx = new BMX("Redline", 40, 1, true);
        
        // Display information and demonstrate behavior for each type of bicycle
        System.out.println("MountainBike Information:");
        mountainBike.displayInfo();
        mountainBike.ride();
        mountainBike.adjustGears();
  
  System.out.println(".......................................................");
      
        System.out.println("\nChildrensBicycle Information:");
        childrensBicycle.displayInfo();
        childrensBicycle.ride();
        childrensBicycle.addTrainingWheels();
  
  System.out.println(".......................................................");
      
        System.out.println("\nBMX Information:");
        bmx.displayInfo();
        bmx.ride();
        bmx.performStunt();
    }
}
