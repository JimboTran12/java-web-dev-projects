package org.launchcode;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {

    @Override
    public int compare(Topping o1, Topping o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
