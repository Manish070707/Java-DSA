package OOPS.BankManagementSystem;
public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    BankAccount(int accountNumber, String name , double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void displayBankAccount(){
        System.out.println("-------------ACCOUNT DETAILS--------------");
        System.out.println("Account Number    : " + accountNumber);
        System.out.println("Name              :" + name);
        System.out.println("Balance           :" + balance);
    }

    int getAccountNumber(){
        return accountNumber;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    String getName(){
        return name;
    }
    double getBalance(){
        return balance;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    void deposit(double depositAmount){
        if(depositAmount>=1){
            balance+=depositAmount;
            System.out.println("Amount Deposited Successfully!✅");
        }else{
            System.out.println("Insufficient Amount!❌");
        }
    }

    void withdraw(double withdrawAmount){
        if(balance>=withdrawAmount && withdrawAmount>0){
            balance-=withdrawAmount;
            System.out.println("Amount Withdraw Successfully!✅");
        }
        else{
            System.out.println("Insufficient Balance!❌");
        }
    }

}
