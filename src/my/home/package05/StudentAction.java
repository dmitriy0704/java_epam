package my.home.package05;

public class StudentAction {
    private static final int BASE_COEFFICIENT = 6;
    public double defineScholarship(float averageMark){
        double value = 100;
        if(averageMark > BASE_COEFFICIENT){
            value *= 1 + (BASE_COEFFICIENT / 10.0);
        }
        return value;
    }
}
