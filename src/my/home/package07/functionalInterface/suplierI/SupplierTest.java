package my.home.package07.functionalInterface.suplierI;

import java.util.function.Supplier;

public class SupplierTest {
    public void test(){
        Supplier<StringBuilder> supplier = () -> new StringBuilder("java");
        StringBuilder builder = supplier.get();
        Supplier<int[]> supplier2 = () -> new int[10];
        int[] arr = supplier2.get();
    }
}
