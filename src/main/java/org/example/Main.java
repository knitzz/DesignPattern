package org.example;

import designPattern.creational.abstractFactoryPattern.factory.FurnitureFactory;
import designPattern.creational.abstractFactoryPattern.factory.ModernFurnitureFactory;
import designPattern.creational.abstractFactoryPattern.factory.VictorianFurnitureFactory;
import designPattern.creational.abstractFactoryPattern.models.Furniture;
import designPattern.creational.factoryPattern.enums.VehicleType;
import designPattern.creational.factoryPattern.factory.VehicleFactory;
import designPattern.creational.factoryPattern.models.Vehicle;
import projects.loggerSystem.enums.LogLevel;

public class Main {
    public static void main(String[] args) {
        /*

        Abstract factory design pattern

         */

        //using factory to pass specifics
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Furniture modernFurniture = new Furniture(modernFurnitureFactory.createChair(), modernFurnitureFactory.createTable());

        //using factory as constructor argument to create specifics in Furniture
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Furniture victorianUsingFactoryAsArg = new Furniture(victorianFurnitureFactory);


         /*

        factory design pattern

         */

        Vehicle bike = VehicleFactory.createVehicle(VehicleType.Bike);
        Vehicle sedan = VehicleFactory.createVehicle(VehicleType.Sedan);


    }
}