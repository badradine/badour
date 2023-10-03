// Abstract class
abstract class Bicycle {
    protected String brand;
    protected int maxSpeed;

    public Bicycle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    // Abstract method
    public abstract void ride();

    // Method to display information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for maxSpeed
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

// Inherited class 1
class MountainBike extends Bicycle {
    private int numGears;

    public MountainBike(String brand, int maxSpeed, int numGears) {
        super(brand, maxSpeed);
        this.numGears = numGears;
    }

    @Override
    public void ride() {
        System.out.println("MountainBike is riding on a trail.");
    }

    // Getter and Setter for numGears
    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }
}

// Inherited class 2
class ChildrensBicycle extends Bicycle {
    private boolean trainingWheels;

    public ChildrensBicycle(String brand, int maxSpeed, boolean trainingWheels) {
        super(brand, maxSpeed);
        this.trainingWheels = trainingWheels;
    }

    @Override
    public void ride() {
        System.out.println("ChildrensBicycle is riding with training wheels.");
    }

    // Getter and Setter for trainingWheels
    public boolean hasTrainingWheels() {
        return trainingWheels;
    }

    public void setTrainingWheels(boolean trainingWheels) {
        this.trainingWheels = trainingWheels;
    }
}

// Inherited class 3
class BMX extends Bicycle {
    private boolean stuntPegs;

    public BMX(String brand, int maxSpeed, boolean stuntPegs) {
        super(brand, maxSpeed);
        this.stuntPegs = stuntPegs;
    }

    @Override
    public void ride() {
        System.out.println("BMX is performing stunts.");
    }

    // Getter and Setter for stuntPegs
    public boolean hasStuntPegs() {
        return stuntPegs;
    }

    public void setStuntPegs(boolean stuntPegs) {
        this.stuntPegs = stuntPegs;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of MountainBike, ChildrensBicycle, and BMX
        MountainBike mountainBike = new MountainBike("Trek", 30, 5);
        ChildrensBicycle childrensBicycle = new ChildrensBicycle("Huffy", 20, true);
        BMX bmx = new BMX("Redline", 40, true);

        // Display information about the bicycles
        mountainBike.displayInfo();
        mountainBike.ride();
        System.out.println("Number of gears: " + mountainBike.getNumGears());

        childrensBicycle.displayInfo();
        childrensBicycle.ride();
        System.out.println("Has training wheels: " + childrensBicycle.hasTrainingWheels());

        bmx.displayInfo();
        bmx.ride();
        System.out.println("Has stunt pegs: " + bmx.hasStuntPegs());

        // Demonstrate specific actions
        mountainBike.ride();
        childrensBicycle.ride();
        bmx.ride();
    }
}




