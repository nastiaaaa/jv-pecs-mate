package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String chassisType;

    public Bulldozer(String chassisType) {
        this.chassisType = chassisType;
    }

    public Bulldozer() {
    }

    public String getChassisType() {
        return chassisType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
