package my.home.package06.functionalInterface.example;

public class RectangleService implements ShapeService {
    @Override
    public double perimeter(double a, double b) {
        return 2 * (a + b);
    }
}
