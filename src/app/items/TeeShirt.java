package app.items;

import app.interfaces.Item;
import app.interfaces.Manufacturer;
import app.manufacturers.ActiveSports;

public abstract class TeeShirt implements Item {
    @Override
    public Manufacturer manufacturer() {return new ActiveSports();}

    @Override
    public abstract float price();
}
