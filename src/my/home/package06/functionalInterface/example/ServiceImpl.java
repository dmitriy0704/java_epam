package my.home.package06.functionalInterface.example;

public class ServiceImpl implements Service {

    @Override
    public int define(int x1, int y1) {
        return x1 + y1;
    }

    @Override
    public void load() {
        System.out.println("load()");
    }
}
