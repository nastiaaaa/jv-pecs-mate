package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private float scoopCapacity;

    public Excavator(float scoopCapacity) {
        this.scoopCapacity = scoopCapacity;
    }

    public Excavator() {
    }

    public float getScoopCapacity() {
        return scoopCapacity;
    }

    public void setScoopCapacity(float scoopCapacity) {
        this.scoopCapacity = scoopCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
