package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.Collections;
import java.util.List;
/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            return (List<T>) producer.get();
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            return (List<T>) producer.get();
        } else if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducer();
            return (List<T>) producer.get();
        }
        return List.of();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        machines.forEach(Workable::doWork);
    }
}
