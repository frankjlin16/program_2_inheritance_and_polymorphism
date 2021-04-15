/*
CSC 205AC #37531
Program 2: Inheritance and Polymorphism
Author: Frank Lin 36680188
Description: <of the file contents>
 */

package main;

public abstract class BankAccount {

    //data
    private String accountNumber;
    private int balance; //in terms of pennies
    private double interestRate;

    //todo: figure out WTF this is suppose to do
    boolean credit(int amount) {
        return true;
    }

    //todo: figure out WTF this is suppose to do
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
    abstract void applyInterest();

    //return information about this account in String form
    abstract String getAccountInfo();
}
