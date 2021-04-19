package main;

public class CheckingAccount extends BankAccount {

    //variables
    private int overdraftFee;

    //apply debit to the checking account
    @Override
    public boolean debit(int amount) {
        this.balance -= amount;
        if (this.balance < 0) {
            this.balance -= this.overdraftFee;
        }
        return true;
    }

    //apply interest to the checking account
    @Override
    public void applyInterest() {
        if (this.balance > 0) {
            this.balance = (int) (this.balance + (this.balance * this.interestRate));
        }
    }

    //returns information on the checking account
    @Override
    public String getAccountInfo() {
        return
                "Account type  : Checking" +
                        "\nAccount #     : " + this.accountNumber +
                        "\nBalance       : " + "$" + String.format("%.2f", (double) this.balance / 100) +
                        "\nInterest rate : " + String.format("%.2f", this.getInterestRate()) + "%" +
                        "\nOverdraft fee : " + "$" + String.format("%.2f", (double) this.getOverdraftFee() / 100);
    }

    //sets the overdraft fee of the checking account
    public void setOverdraftFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    //returns the overdraft free of the checking account
    public int getOverdraftFee() {
        return overdraftFee;
    }
}
