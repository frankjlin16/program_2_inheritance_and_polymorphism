package main;

public class CheckingAccount extends BankAccount {

    @Override
    boolean debit(int amount) {
        return false;
    }

    @Override
    void applyInterest() {

    }

    @Override
    String getAccountInfo() {
        return null;
    }
}
