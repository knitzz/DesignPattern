package designPattern.creational.abstractFactoryPattern.factory;

import designPattern.creational.abstractFactoryPattern.models.VictorianTable;
import designPattern.creational.abstractFactoryPattern.models.Chair;
import designPattern.creational.abstractFactoryPattern.models.Table;
import designPattern.creational.abstractFactoryPattern.models.VictorianChair;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
