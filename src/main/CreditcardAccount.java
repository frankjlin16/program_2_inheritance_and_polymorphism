package main;

public class CreditcardAccount extends BankAccount {

    //variables
    private int creditLimit;

    //applies debit to the credit  card
    @Override
    public boolean debit(int amount) {
        if (this.creditLimit >= amount) {
            this.creditLimit -= amount;
            this.balance -= amount;
            return true;
        }
        return false; //insufficient funds
    }

    //applies credit to the credit card
    @Override
    public boolean credit(int amount) {
        balance += amount;
        creditLimit += amount;
        return true;
    }


    //applies interest to credit card
    @Override
    public void applyInterest() {
        if (this.balance < 0) {
            this.balance = (int) (this.balance + (this.balance * this.interestRate));
        }
    }

    //returns information about the account
    @Override
    public String getAccountInfo() {
        return
                "Account type  : Creditcard" +
                        "\nAccount #     : " + this.accountNumber +
                        "\nBalance       : $" + String.format("%.2f", (double) this.getBalance() / 100) +
                        "\nInterest rate : " + String.format("%.2f", this.getInterestRate()) + "%" +
                        "\nCredit limit  : $" + String.format("%.2f", (double) this.getCreditLimit() / 100);
    }

    //sets the credit limit of the credit card
    public void setCreditLimit(int creditLimit) {
        this.creditLimit += creditLimit;
    }

    //returns the credit limit of the credit card
    public int getCreditLimit() {
        return creditLimit;
    }
}
