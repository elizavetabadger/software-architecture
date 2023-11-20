package homework4;

import java.text.DecimalFormat;

public class Account {

    private long idUserAcc;
    private DecimalFormat balance;

    public Account(DecimalFormat balance) {

        this.balance = balance;
    }

    public long getIdUserAcc() {
        return idUserAcc;
    }

    public void setIdUserAcc(long id) {
        this.idUserAcc = idUserAcc;
    }
    public void setBalance(DecimalFormat balance) {
        this.balance = balance;
    }

    public DecimalFormat getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account {" +
                " balance= " + balance +
                " }";
    }
}