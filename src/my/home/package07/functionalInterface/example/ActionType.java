package my.home.package07.functionalInterface.example;

public class ActionType {
    private double x;
    private double y;

    public ActionType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double action(ShapeService service) {
        return 10 * service.perimeter(x, y);
    }


//    double res = new ActionType(2, 3).action(
//            (a, b) -> {
//                return (a + b) * 2;
//            }
//    );

}
