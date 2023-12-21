package my.home.package12;

public class Main {
    public static void main(String[] args) {
        // Потоки:
        // Класс Thread, Интрефейсы Runnable и Callable

WalkThread walk = new WalkThread();
TalkThread talk = new Thread(new TalkThread());

    }
}
