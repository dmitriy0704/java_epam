package my.home.package12;

public class Main {
    public static void main(String[] args) {

        /* Потоки:
         * Класс Thread, Интрефейсы Runnable и Callable
         */

        /*
         * Состояния потока:
         * новый
         * работоспособный
         * неработоспособный
         * пассивный
         */

        /*
         * Thread.State.NEW
         *      - поток создан (новый)
         * Thread.State.RUNNABLE
         *      - поток запущен (работоспоспособный)
         *      -> start()
         * Thread.State.BLOCKED
         *      - поток блокирован
         * Thread.State.WAITING
         *      - поток ждет окончания другого потока (неработоспособный)
         *      -> join(), wait()
         * Thread.State.TIMED_WAITING
         *      - поток некоторое время ждет окончания другого потока или просто в ожидании истечения времени
         *      -> sleep(int mills), join(long timeout), wait(int timeout)
         * Thread.State.TERMINATED - поток завершен (пассивный)
         *
         * */

        WalkThread walk = new WalkThread();
        Thread talk = new Thread(new TalkThread());
        walk.start();
        talk.start();
    }
}
