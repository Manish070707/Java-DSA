package OOPS.BankManagementSystem;
import java.util.*;
public class BankManagement {
    BankAccount accounts[] = new BankAccount[100];
    int count = 0;

    void createBankAccount(Scanner sc){
        System.out.print("Enter Account Number   :  ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name    : " );
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance  : ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accountNumber, name, balance);
        accounts[count] = account;
        count++;
    }
    void displayAccount(Scanner sc){
        if(count==0){
            return;
        }
        System.out.print("Enter Bank Account Number : ");
        int accountNumber = sc.nextInt();
        boolean found = false;
        for(int i=0;i<count;i++){
            if(accountNumber == accounts[i].getAccountNumber()){
                accounts[i].displayBankAccount();
                found = true;
            }
        }
        if(!found){
            System.out.println("No Record Found!❌");
        }
        
    }
    void depositMoney(Scanner sc){
        System.out.print("Enter Bank Account Number : ");
        int accountNumber = sc.nextInt();
        boolean found = false;
        for(int i=0;i<count;i++){
            if(accountNumber == accounts[i].getAccountNumber()){
                System.out.print("Enter Deposit Amount : ");
                double depositAmount = sc.nextDouble();
                accounts[i].deposit(depositAmount);
                System.out.println("Balance " + depositAmount + "Deposit Successfully!✅");
            }
        }
        if(!found){
            System.out.println("No Record Found!❌");
        }
    }
    void withdrawMoney(Scanner sc){
        System.out.print("Enter Bank Account Number : ");
        int accountNumber = sc.nextInt();
        boolean found = false;
        for(int i=0;i<count;i++){
            if(accountNumber == accounts[i].getAccountNumber()){
                System.out.print("Enter Withdraw Amount : ");
                double withdrawAmount = sc.nextDouble();
                accounts[i].withdraw(withdrawAmount);
                System.out.println("Balance " + withdrawAmount + "Withdraw Successfully!✅");
            }
        }
        if(!found){
            System.out.println("No Record Found!❌");
        }
    }

    void checkBalance(Scanner sc){
        System.out.print("Enter Bank Account Number : ");
        int accountNumber = sc.nextInt();
        boolean found = false;
        for(int i=0;i<count;i++){
            if(accountNumber == accounts[i].getAccountNumber()){
                accounts[i].displayBankAccount();
            }
        }
        if(!found){
            System.out.println("No Record Found!❌");
        }
    }

}