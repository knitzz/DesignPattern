package designPattern.creational.abstractFactoryPattern.factory;


import designPattern.creational.abstractFactoryPattern.models.ModernTable;
import designPattern.creational.abstractFactoryPattern.models.Table;
import designPattern.creational.abstractFactoryPattern.models.Chair;
import designPattern.creational.abstractFactoryPattern.models.ModernChair;

public final class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }
}
