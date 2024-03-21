package app.items;

import app.interfaces.Item;
import app.interfaces.Manufacturer;
import app.manufacturers.SmartCaps;

public abstract class Cap implements Item {
    @Override
    public Manufacturer manufacturer() {return new SmartCaps();}

    @Override
    public abstract float price();
}
