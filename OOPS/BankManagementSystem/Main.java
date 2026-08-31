package OOPS.BankManagementSystem;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankManagement bankAccount = new BankManagement();
        int choice;
        do{
            System.out.println("=============================================");
            System.out.println("        Bank Account Management System       ");
            System.out.println("=============================================");
            System.out.println("----------------------------------------------");
            System.out.println("        Welcome to the State Bank Of India       ");
            System.out.println("----------------------------------------------");
            System.out.println("1. Create Bank Account  : ");
            System.out.println("2. Display Bank Account : ");
            System.out.println("3. Deposit Money        : ");
            System.out.println("4. Withdraw Money       : ");
            System.out.println("5. Check Balance        : ");
            System.out.println("6. Exit                 : ");

            System.out.println("----------------------------------------------");
            System.out.print("Enter Choice              : ");
            
            choice = sc.nextInt();
            System.out.println("----------------------------------------------");
            switch(choice){
                case 1:
                    bankAccount.createBankAccount(sc);
                    break;
                case 2:
                    bankAccount.displayAccount(sc);
                    break;
                case 3:
                   bankAccount.depositMoney(sc);
                    break;
                case 4:
                    bankAccount.withdrawMoney(sc);
                    break;
                case 5:
                    bankAccount.checkBalance(sc);
                    break;
                case 6:
                     System.out.println("Thank You for using Bank Management System!");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
        while(choice!= 6);
        sc.close();
    }
}