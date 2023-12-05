package my.home.package03.abstract_methods;

import java.math.BigDecimal;

public abstract class AbstractCardAction {
    private BigDecimal amount;
    public AbstractCardAction(){}
    public abstract void doPayment(BigDecimal amountPayment);

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
