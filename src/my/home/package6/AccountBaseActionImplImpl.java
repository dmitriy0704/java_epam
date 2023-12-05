package my.home.package6;

public class AccountBaseActionImplImpl implements AccountBaseAction {
    @Override
    public boolean openAccount() {
        return false;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unBlocking() {
        // some code;
    }
}
