/*
CSC 205AC #37531
Program 2: Inheritance and Polymorphism
Authors: Frank Lin 36680188 && todo: Trevor add your name and ID here
Description: Simulate the inner workings of a bank account.
 */

package main;

public abstract class BankAccount {

    //data
    private String accountNumber;
    private int balance, credit, debit, fees; //in terms of pennies
    private double interestRate;

    //todo: figure out WTF this is suppose to do
    boolean credit(int amount) {
        balance += amount; //todo: is this what requirements mean?
        return true;
    }

    //todo: figure out WTF this is suppose to do
    //debit amounts will be subtracted from the balance
    //will return false if the transaction cannot be made because of insufficient balance or insufficient credit limit.
    //Otherwise they will return true.
    abstract boolean debit(int amount);

    //returns balance of this account
    public int getBalance() {
        return balance;
    }

    //returns account number of this account
    public String getAccountNumber() {
        return accountNumber;
    }

    //sets the account number of this account
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //returns interesting rate of this account
    public double getInterestRate() {
        return interestRate;
    }

    //sets the interest rate of this account
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //applies interest rate -> balance + (balance * interestRate)
    //will not be applied to any Savings or Checking account with a balance of zero or less
    abstract void applyInterest();

    //return information about this account in String form
    abstract String getAccountInfo();
}
