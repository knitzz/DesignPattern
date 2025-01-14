package designPattern.creational.factoryPattern.factory;

import designPattern.creational.factoryPattern.enums.VehicleType;
import designPattern.creational.factoryPattern.models.FourWheeler;
import designPattern.creational.factoryPattern.models.TwoWheeler;
import designPattern.creational.factoryPattern.models.Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case VehicleType.Bike, VehicleType.Scooter -> new TwoWheeler();
            case VehicleType.HatchBack, VehicleType.Sedan -> new FourWheeler();
        };
    }
}
