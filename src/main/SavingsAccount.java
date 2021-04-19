package main;

public class SavingsAccount extends BankAccount {

    //apply debit to the savings account
    @Override
    public boolean debit(int amount) {
        if (this.balance >= amount) {
            this.balance = (this.balance - amount);
            return true;
        }
        return false; //insufficient funds
    }

    //apply interesting to the savings account
    @Override
    public void applyInterest() {
        this.balance += (int) (this.balance * this.interestRate);
    }

    //returns account information of this savings account
    @Override
    public String getAccountInfo() {
        return "Account type   : Savings" +
                "\nAccount #     : " + this.accountNumber +
                "\nBalance       : $" + String.format("%.2f", (double) this.getBalance() / 100) +
                "\nInterest rate : " + String.format("%.2f", this.getInterestRate()) + "%";
    }
}
