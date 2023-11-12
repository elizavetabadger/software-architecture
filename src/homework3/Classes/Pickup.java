package homework3.Classes;

import homework3.Enumerators.TypeCar;
import homework3.Enumerators.TypeFuel;
import homework3.Enumerators.TypeGearBox;
import homework3.Interfaces.ICarWash;
import homework3.Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash {

    private int loadCap;

    public Pickup(String make, String model,
                  int numberWheels, TypeFuel fuelType, TypeGearBox gearBoxType,
                  Color bodyColor, int engineCap, int loadCap) {

        super(make, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);

        this.loadCap = loadCap;

    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }

}
