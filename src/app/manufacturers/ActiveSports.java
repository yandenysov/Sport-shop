package app.manufacturers;

import app.interfaces.Manufacturer;

public class ActiveSports implements Manufacturer {
    @Override
    public String manufacturerName() {
        return "Active Sports";
    }

    @Override
    public String toString() {
        return "Active Sports";
    }
}
