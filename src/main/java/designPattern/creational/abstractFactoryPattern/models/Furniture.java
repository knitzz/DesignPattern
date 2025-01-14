package designPattern.creational.abstractFactoryPattern.models;

import designPattern.creational.abstractFactoryPattern.factory.FurnitureFactory;

public class Furniture {
    private Table  table;
    private Chair chair;
    public Furniture(Chair chair, Table table) {
        this.chair = chair;
        this.table = table;
    }

    public Furniture(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
    }
}
