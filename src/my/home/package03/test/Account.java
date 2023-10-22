package my.home.package03.test;

public class Account {

    private long accountId;

    private double asset;

    protected static String name = "Static variable";

    public Account() {

    }

    public Account(long accountId, double asset) {
        this.accountId = accountId;
        this.asset = asset;
    }

    // Getters and Setters:

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }


}
