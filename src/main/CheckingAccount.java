package main;

public class CheckingAccount extends BankAccount {

    //variables
    private int overdraftFee;

    @Override
    public boolean debit(int amount) {
        this.balance -= amount;
        if (this.balance < 0) {
            this.balance -= this.overdraftFee;
        }
        return true;
    }

    @Override
    public void applyInterest() {
        if (this.balance < 0) {
            this.interestRate = 0;
        } else {
            this.balance = (int) (this.balance + (this.balance * this.interestRate));
        }

    }

    @Override
    public String getAccountInfo() {
        return
                "Account type  : Checking" +
                        "\nAccount #     : " + this.accountNumber +
                        "\nBalance       : " + "$" + String.format("%.2f", (double) this.balance / 100) +
                        "\nInterest rate : " + String.format("%.2f", this.getInterestRate()) + "%" +
                        "\nOverdraft fee : " + "$" + String.format("%.2f", (double) this.getOverdraftFee() / 100);
    }

    public void setOverdraftFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public int getOverdraftFee() {
        return overdraftFee;
    }
}
