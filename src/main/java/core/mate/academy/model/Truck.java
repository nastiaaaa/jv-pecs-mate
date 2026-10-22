package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private float openBedSize;

    public Truck(float openBedSize) {
        this.openBedSize = openBedSize;
    }

    public Truck() {
    }

    public float getOpenBedSize() {
        return openBedSize;
    }

    public void setOpenBedSize(float openBedSize) {
        this.openBedSize = openBedSize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
