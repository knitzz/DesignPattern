package designPattern.creational.abstractFactoryPattern.factory;

import designPattern.creational.abstractFactoryPattern.models.Table;
import designPattern.creational.abstractFactoryPattern.models.Chair;public interface FurnitureFactory {
    public Chair createChair();
    public Table createTable();
}
