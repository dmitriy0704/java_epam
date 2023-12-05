package my.home.package03.static_methods;

public class Tst {

    public static int tsi = 12;
private int nost = 42;

    public Tst(){

    }

    public int getNost() {
        return nost;
    }

    public void setNost(int nost) {
        this.nost = nost;
    }

    public void n(){
        System.out.println(nost);
        tsi = 5;
        System.out.println(tsi);
    }

    public static void printText(){
        System.out.println("Print text to static method");
    }
}
