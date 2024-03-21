package app.manufacturers;

import app.interfaces.Manufacturer;

public class SmartCaps implements Manufacturer {
    @Override
    public String manufacturerName() {
        return "Smart Caps";
    }

    @Override
    public String toString() {
        return "Smart Caps";
    }
}
