package my.home.package06;

public interface AccountBaseAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    default void unBlocking() {}
}
