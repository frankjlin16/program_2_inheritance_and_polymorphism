package main;

public class CreditcardAccount extends BankAccount{

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
