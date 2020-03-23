package OOP.Challenges.Constructors;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("000000000", 0, "Default Name", "Default Email", "Default Phone Number");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("0000000", 0, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance = " + this.balance);
    }

    public void withdrawal(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("You can't withdraw so many.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }
}
