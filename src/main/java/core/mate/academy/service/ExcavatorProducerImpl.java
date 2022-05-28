package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl<T extends Machine> extends TrackProducerImpl {
    private List<Excavator> excavatorsList;

    @Override
    public List<Excavator> get() {
        excavatorsList = new ArrayList<>();
        Excavator cat = new Excavator(20, 30, Excavator.ExcavatorType.HYDRAULIC);
        Excavator man = new Excavator(40, 50, Excavator.ExcavatorType.PNEUMATIC);
        Excavator maz = new Excavator(15, 20, Excavator.ExcavatorType.ON_THE_ROPES);
        excavatorsList.add(cat);
        excavatorsList.add(man);
        excavatorsList.add(maz);
        return excavatorsList;
    }
}
