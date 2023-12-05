package my.home.package6;

public interface AccountBaseAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    default void unBlocking() {}
}
