package designPattern.creational.singleton;

public class SingletonClass {
    private Integer count;
    private SingletonClass() {}
    public static SingletonClass getInstance() {
        if(SingletonClass.singleton == null) {
            SingletonClass.singleton = new SingletonClass();
            return SingletonClass.singleton;
        } else {
            return SingletonClass.singleton;
        }
    }
    private static SingletonClass singleton;
}
