package my.home.package03.test;

public class Order {

    public void createAccount(){
        Account account = new Account();
        account.setAccountId(2L);
        showAccount(account.getAccountId());
    }

    public void showAccount(Long accId){
        System.out.println("AccId = " + accId + " " + Account.name);
    }
}
