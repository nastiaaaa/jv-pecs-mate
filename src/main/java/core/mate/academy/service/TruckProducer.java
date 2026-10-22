package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck(500.6F),
                new Truck(400.8F),
                new Truck(607.77F));
    }
}
